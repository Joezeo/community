package com.joezeo.community.pojo;

public class Comment {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_comment.id
     *
     * @mbg.generated Sat Jan 25 17:20:11 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_comment.parent_id
     *
     * @mbg.generated Sat Jan 25 17:20:11 CST 2020
     */
    private Long parentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_comment.parent_type
     *
     * @mbg.generated Sat Jan 25 17:20:11 CST 2020
     */
    private Integer parentType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_comment.userid
     *
     * @mbg.generated Sat Jan 25 17:20:11 CST 2020
     */
    private Long userid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_comment.content
     *
     * @mbg.generated Sat Jan 25 17:20:11 CST 2020
     */
    private String content;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_comment.like_count
     *
     * @mbg.generated Sat Jan 25 17:20:11 CST 2020
     */
    private Integer likeCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_comment.gmt_create
     *
     * @mbg.generated Sat Jan 25 17:20:11 CST 2020
     */
    private Long gmtCreate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_comment.gmt_modify
     *
     * @mbg.generated Sat Jan 25 17:20:11 CST 2020
     */
    private Long gmtModify;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_comment.comment_count
     *
     * @mbg.generated Sat Jan 25 17:20:11 CST 2020
     */
    private Integer commentCount;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_comment.id
     *
     * @return the value of t_comment.id
     *
     * @mbg.generated Sat Jan 25 17:20:11 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_comment.id
     *
     * @param id the value for t_comment.id
     *
     * @mbg.generated Sat Jan 25 17:20:11 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_comment.parent_id
     *
     * @return the value of t_comment.parent_id
     *
     * @mbg.generated Sat Jan 25 17:20:11 CST 2020
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_comment.parent_id
     *
     * @param parentId the value for t_comment.parent_id
     *
     * @mbg.generated Sat Jan 25 17:20:11 CST 2020
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_comment.parent_type
     *
     * @return the value of t_comment.parent_type
     *
     * @mbg.generated Sat Jan 25 17:20:11 CST 2020
     */
    public Integer getParentType() {
        return parentType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_comment.parent_type
     *
     * @param parentType the value for t_comment.parent_type
     *
     * @mbg.generated Sat Jan 25 17:20:11 CST 2020
     */
    public void setParentType(Integer parentType) {
        this.parentType = parentType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_comment.userid
     *
     * @return the value of t_comment.userid
     *
     * @mbg.generated Sat Jan 25 17:20:11 CST 2020
     */
    public Long getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_comment.userid
     *
     * @param userid the value for t_comment.userid
     *
     * @mbg.generated Sat Jan 25 17:20:11 CST 2020
     */
    public void setUserid(Long userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_comment.content
     *
     * @return the value of t_comment.content
     *
     * @mbg.generated Sat Jan 25 17:20:11 CST 2020
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_comment.content
     *
     * @param content the value for t_comment.content
     *
     * @mbg.generated Sat Jan 25 17:20:11 CST 2020
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_comment.like_count
     *
     * @return the value of t_comment.like_count
     *
     * @mbg.generated Sat Jan 25 17:20:11 CST 2020
     */
    public Integer getLikeCount() {
        return likeCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_comment.like_count
     *
     * @param likeCount the value for t_comment.like_count
     *
     * @mbg.generated Sat Jan 25 17:20:11 CST 2020
     */
    public void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_comment.gmt_create
     *
     * @return the value of t_comment.gmt_create
     *
     * @mbg.generated Sat Jan 25 17:20:11 CST 2020
     */
    public Long getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_comment.gmt_create
     *
     * @param gmtCreate the value for t_comment.gmt_create
     *
     * @mbg.generated Sat Jan 25 17:20:11 CST 2020
     */
    public void setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_comment.gmt_modify
     *
     * @return the value of t_comment.gmt_modify
     *
     * @mbg.generated Sat Jan 25 17:20:11 CST 2020
     */
    public Long getGmtModify() {
        return gmtModify;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_comment.gmt_modify
     *
     * @param gmtModify the value for t_comment.gmt_modify
     *
     * @mbg.generated Sat Jan 25 17:20:11 CST 2020
     */
    public void setGmtModify(Long gmtModify) {
        this.gmtModify = gmtModify;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_comment.comment_count
     *
     * @return the value of t_comment.comment_count
     *
     * @mbg.generated Sat Jan 25 17:20:11 CST 2020
     */
    public Integer getCommentCount() {
        return commentCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_comment.comment_count
     *
     * @param commentCount the value for t_comment.comment_count
     *
     * @mbg.generated Sat Jan 25 17:20:11 CST 2020
     */
    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }
}