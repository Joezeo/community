package com.joezeo.community.pojo;

public class CommentLikeUser {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_comment_like_user.id
     *
     * @mbg.generated Wed Feb 19 13:12:27 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_comment_like_user.commentid
     *
     * @mbg.generated Wed Feb 19 13:12:27 CST 2020
     */
    private Long commentid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_comment_like_user.userid
     *
     * @mbg.generated Wed Feb 19 13:12:27 CST 2020
     */
    private Long userid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_comment_like_user.gmt_create
     *
     * @mbg.generated Wed Feb 19 13:12:27 CST 2020
     */
    private Long gmtCreate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_comment_like_user.gmt_modify
     *
     * @mbg.generated Wed Feb 19 13:12:27 CST 2020
     */
    private Long gmtModify;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_comment_like_user.id
     *
     * @return the value of t_comment_like_user.id
     *
     * @mbg.generated Wed Feb 19 13:12:27 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_comment_like_user.id
     *
     * @param id the value for t_comment_like_user.id
     *
     * @mbg.generated Wed Feb 19 13:12:27 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_comment_like_user.commentid
     *
     * @return the value of t_comment_like_user.commentid
     *
     * @mbg.generated Wed Feb 19 13:12:27 CST 2020
     */
    public Long getCommentid() {
        return commentid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_comment_like_user.commentid
     *
     * @param commentid the value for t_comment_like_user.commentid
     *
     * @mbg.generated Wed Feb 19 13:12:27 CST 2020
     */
    public void setCommentid(Long commentid) {
        this.commentid = commentid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_comment_like_user.userid
     *
     * @return the value of t_comment_like_user.userid
     *
     * @mbg.generated Wed Feb 19 13:12:27 CST 2020
     */
    public Long getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_comment_like_user.userid
     *
     * @param userid the value for t_comment_like_user.userid
     *
     * @mbg.generated Wed Feb 19 13:12:27 CST 2020
     */
    public void setUserid(Long userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_comment_like_user.gmt_create
     *
     * @return the value of t_comment_like_user.gmt_create
     *
     * @mbg.generated Wed Feb 19 13:12:27 CST 2020
     */
    public Long getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_comment_like_user.gmt_create
     *
     * @param gmtCreate the value for t_comment_like_user.gmt_create
     *
     * @mbg.generated Wed Feb 19 13:12:27 CST 2020
     */
    public void setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_comment_like_user.gmt_modify
     *
     * @return the value of t_comment_like_user.gmt_modify
     *
     * @mbg.generated Wed Feb 19 13:12:27 CST 2020
     */
    public Long getGmtModify() {
        return gmtModify;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_comment_like_user.gmt_modify
     *
     * @param gmtModify the value for t_comment_like_user.gmt_modify
     *
     * @mbg.generated Wed Feb 19 13:12:27 CST 2020
     */
    public void setGmtModify(Long gmtModify) {
        this.gmtModify = gmtModify;
    }
}