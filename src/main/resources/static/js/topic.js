var path = window.location.href;
var topicId = path.substr(path.lastIndexOf("/") + 1);
var user={};
var topic = {};
var comments = {};
var subComments = {};
var commentContent = "";

var loadedTopic = false;
var loadedComments = false;
var loadedSubComments = false;

axios.default.withCredentials = true;
var vue = new Vue({
    el: "#topic",
    data: {
        topicId, topic, comments, subComments, user, loadedTopic, loadedComments, loadedSubComments, commentContent
    },
    mounted: function () {
        // 加载markdown预览
        var testView = editormd.markdownToHTML("topic-markdown-view", {
            // markdown : "[TOC]\n### Hello world!\n## Heading 2", // Also, you can dynamic set Markdown text
            // htmlDecode : true,  // Enable / disable HTML tag encode.
            // htmlDecode : "style,script,iframe",  // Note: If enabled, you should filter some dangerous HTML tags for website security.
        });
        this.getUser();
        this.getTopic(this.topicId);
        this.getComments(this.topicId);
        this.subComment(0);
    },
    methods: {
        // 回复问题
        doComment: doComment,
        // 点击回复评论功能
        subComment: subComment,
        // 点击二级回复的取消 关闭二级评论框
        closeSubcomment: closeSubcomment,
        // 点击二级回复的回复按钮，提交二级评论
        doSubcomment: doSubcomment,
        // 如未登录点击链接自动登录
        autoLogin: autoLogin,
        getUser: function(){
            var url = "/getUser";
            axios.post(url).then(function (response) {
                var jsonResult = response.data;
                if(jsonResult.success){
                    vue.user = jsonResult.data;
                } else {
                    alert(jsonResult.message);
                }
            })
        },
        getTopic: function (topicId) {
            var url = "/topic/getTopic";
            var params = {id: topicId};
            axios.post(url, params).then(function (response) {
                var jsonResult = response.data;
                if (jsonResult.success) {
                    vue.topic = jsonResult.data;
                    vue.loadedTopic = true;
                    // Editor.md无法用vue设置，暂时使用jquery赋值
                    // $("#topic-textarea").val(vue.topic.description);
                } else {
                    alert(jsonResult.message);
                }
            })
        },
        getComments: function (topicId) {
            var url = "/topic/getComments";
            var params = {id: topicId};
            axios.post(url, params).then(function (response) {
                var jsonResult = response.data;
                if (jsonResult.success) {
                    vue.comments = jsonResult.data;
                    vue.loadedComments = true;
                } else {
                    alert(jsonResult.message);
                }
            })
        },
        splitTag: function (tag) {
            return tag.split(",");
        }
    }
});

function autoLogin() {
    window.localStorage.setItem("closable", true);
    window.open("https://github.com/login/oauth/authorize?client_id=332735b1b85bfbb88779&scope=user&state=1");
    // 当完成github第三方验证后，关闭主页，取出localStorage中的closable，刷新当前页面
    window.setInterval(function () {
        if (!window.localStorage.getItem("closable"))
            window.location.reload();
    }, 200);
}

function doComment() {
    var content = vue.commentContent.trim();
    if (content == "") {
        alert("回复内容不可为空，请输入后再回复");
        return false;
    }
    content = vue.commentContent;

    var type = 0; // topic
    var url = "/comment";
    var params = {content: content, parentId: topicId, parentType: type, topicid: vue.topicId};
    axios.post(url, params).then(function (response) {
        var jsonResult = response.data;
        if (jsonResult.success) {
            window.location.reload();
        } else {
            if (jsonResult.code == 2004) { // 用户未进行登录操作
                var flag = confirm("当前操作需用户登录后进行，点击确定自动登录");
                if (flag) {
                    window.open("https://github.com/login/oauth/authorize?client_id=332735b1b85bfbb88779&scope=user&state=1");
                    window.localStorage.setItem("closable", true);
                    window.setInterval(function () {
                        if (!window.localStorage.getItem("closable"))
                            window.location.reload();
                    }, 200);
                }
            } else {
                alert(jsonResult.message);
            }
        }
    });
}

// 点击回复评论按钮
// 获取该评论的所有二级评论
function subComment(commentId) {
    // vue mounted中执行一次 避免第一次点击无效
    var subcomment = $("#subcomment-" + commentId);
    var isShow = subcomment.hasClass("in");
    if (isShow) { // 当前二级评论框已经显示
        subcomment.removeClass("in");
    } else {
        // 显示二级评论前先关闭所有二级评论框
        $(".collapse").removeClass("in");
        subcomment.addClass("in");

        var url = '/comment/getSubcomment';
        var params = {id: commentId};
        axios.post(url, params).then(function (response) {
            var jsonResult = response.data;
            if (jsonResult.success) {
                vue.subComments = jsonResult.data;
                vue.loadedSubComments = true;
            }
        });
    }
    return false;
}

function closeSubcomment(commentId) {
    $("#subcomment-"+commentId).removeClass("in");
}

// 提交二级评论
function doSubcomment(commentId) {
    var content = $("#subcomment-content-" + commentId).val();
    if (!content) {
        alert("回复内容不可为空，请输入！");
        return false;
    }
    var url = "/comment/subComment";
    var params = {parentId: commentId, parentType: 1, content: content, topicid: vue.topicId};
    axios.post(url, params).then(function (response) {
        var jsonResult = response.data;
        if (jsonResult.success) {
            // 回复成功清空回复框的内容
            $("#subcomment-content-" + commentId).val("");

            // 静态地使页面的评论回复数增加
            var count = $("#subcomment-count" + commentId).html();
            $("#subcomment-count" + commentId).html(parseInt(count) + 1);

            // 重新加载二级评论
            var subcomment = $("#subcomment-" + commentId);
            subcomment.removeClass("in");
            subComment(commentId);
        } else {
            if (jsonResult.code == 2004) { // 用户未进行登录操作
                var flag = confirm("当前操作需用户登录后进行，点击确定自动登录");
                if (flag) {
                    window.open("https://github.com/login/oauth/authorize?client_id=332735b1b85bfbb88779&scope=user&state=1");
                    window.localStorage.setItem("closable", true);
                    window.setInterval(function () {
                        if (!window.localStorage.getItem("closable"))
                            window.location.reload();
                    }, 200);
                }
            } else {
                alert(jsonResult.message);
            }
        }
    });
}