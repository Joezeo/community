var vue = new Vue({
    el:"#spider",
    data:{},
    mounted:function () {

    },
    methods:{
        steamAuth:function(){
            var url = '/steam/auth';
            axios.post(url).then(function (result) {
                var jsonResult = result.data;
                if(jsonResult.success){
                    alert("Steam Auth 测试已发送");
                } else {
                    alert(jsonResult.message);
                }
            });
        },
        spideProxyIP: function () {
            var url = 'spideProxyIP';
            axios.post(url).then(function (response) {
                var jsonResult = response.data;
                if (jsonResult.success) {

                } else {
                    alert(jsonResult.message);
                }
            })
        },
        spideUrl: function () {
            var url = 'spideUrl';
            axios.post(url).then(function (response) {
                var jsonResult = response.data;
                if (jsonResult.success) {

                } else {
                    alert(jsonResult.message);
                }
            })
        },
        spideApp: function () {
            var url = 'spideApp';
            axios.post(url).then(function (response) {
                var jsonResult = response.data;
                if (jsonResult.success) {

                } else {
                    alert(jsonResult.message);
                }
            })
        },
        checkUrl: function () {
            var url = 'checkUrl';
            axios.post(url).then(function (response) {
                var jsonResult = response.data;
                if (jsonResult.success) {

                } else {
                    alert(jsonResult.message);
                }
            })
        },
        checkApp: function () {
            var url = 'checkApp';
            axios.post(url).then(function (response) {
                var jsonResult = response.data;
                if (jsonResult.success) {

                } else {
                    alert(jsonResult.message);
                }
            })
        },
        spideSpecialPrice: function () {
            var url = 'spideSpecialPrice';
            axios.post(url).then(function (response) {
                var jsonResult = response.data;
                if (jsonResult.success) {

                } else {
                    alert(jsonResult.message);
                }
            })
        }
    }
});