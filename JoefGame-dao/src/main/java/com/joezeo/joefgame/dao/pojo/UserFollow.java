package com.joezeo.joefgame.dao.pojo;

public class UserFollow {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_follow.id
     *
     * @mbg.generated Fri Mar 20 22:14:24 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_follow.userid
     *
     * @mbg.generated Fri Mar 20 22:14:24 CST 2020
     */
    private Long userid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_follow.follow_id
     *
     * @mbg.generated Fri Mar 20 22:14:24 CST 2020
     */
    private Long followId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_follow.gmt_create
     *
     * @mbg.generated Fri Mar 20 22:14:24 CST 2020
     */
    private Long gmtCreate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_follow.gmt_mofify
     *
     * @mbg.generated Fri Mar 20 22:14:24 CST 2020
     */
    private Long gmtMofify;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_follow.id
     *
     * @return the value of t_user_follow.id
     *
     * @mbg.generated Fri Mar 20 22:14:24 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_follow.id
     *
     * @param id the value for t_user_follow.id
     *
     * @mbg.generated Fri Mar 20 22:14:24 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_follow.userid
     *
     * @return the value of t_user_follow.userid
     *
     * @mbg.generated Fri Mar 20 22:14:24 CST 2020
     */
    public Long getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_follow.userid
     *
     * @param userid the value for t_user_follow.userid
     *
     * @mbg.generated Fri Mar 20 22:14:24 CST 2020
     */
    public void setUserid(Long userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_follow.follow_id
     *
     * @return the value of t_user_follow.follow_id
     *
     * @mbg.generated Fri Mar 20 22:14:24 CST 2020
     */
    public Long getFollowId() {
        return followId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_follow.follow_id
     *
     * @param followId the value for t_user_follow.follow_id
     *
     * @mbg.generated Fri Mar 20 22:14:24 CST 2020
     */
    public void setFollowId(Long followId) {
        this.followId = followId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_follow.gmt_create
     *
     * @return the value of t_user_follow.gmt_create
     *
     * @mbg.generated Fri Mar 20 22:14:24 CST 2020
     */
    public Long getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_follow.gmt_create
     *
     * @param gmtCreate the value for t_user_follow.gmt_create
     *
     * @mbg.generated Fri Mar 20 22:14:24 CST 2020
     */
    public void setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_follow.gmt_mofify
     *
     * @return the value of t_user_follow.gmt_mofify
     *
     * @mbg.generated Fri Mar 20 22:14:24 CST 2020
     */
    public Long getGmtMofify() {
        return gmtMofify;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_follow.gmt_mofify
     *
     * @param gmtMofify the value for t_user_follow.gmt_mofify
     *
     * @mbg.generated Fri Mar 20 22:14:24 CST 2020
     */
    public void setGmtMofify(Long gmtMofify) {
        this.gmtMofify = gmtMofify;
    }
}