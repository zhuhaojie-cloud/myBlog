package life.majiang.community.model;

public class Autoaction {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column autoaction.id
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column autoaction.gmt_create
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    private Long gmtCreate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column autoaction.gmt_modified
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    private Long gmtModified;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column autoaction.user_id
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    private Long userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column autoaction.name
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column autoaction.isdelete
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    private Integer isdelete;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column autoaction.id
     *
     * @return the value of autoaction.id
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column autoaction.id
     *
     * @param id the value for autoaction.id
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column autoaction.gmt_create
     *
     * @return the value of autoaction.gmt_create
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    public Long getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column autoaction.gmt_create
     *
     * @param gmtCreate the value for autoaction.gmt_create
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    public void setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column autoaction.gmt_modified
     *
     * @return the value of autoaction.gmt_modified
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    public Long getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column autoaction.gmt_modified
     *
     * @param gmtModified the value for autoaction.gmt_modified
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    public void setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column autoaction.user_id
     *
     * @return the value of autoaction.user_id
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column autoaction.user_id
     *
     * @param userId the value for autoaction.user_id
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column autoaction.name
     *
     * @return the value of autoaction.name
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column autoaction.name
     *
     * @param name the value for autoaction.name
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column autoaction.isdelete
     *
     * @return the value of autoaction.isdelete
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    public Integer getIsdelete() {
        return isdelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column autoaction.isdelete
     *
     * @param isdelete the value for autoaction.isdelete
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    public void setIsdelete(Integer isdelete) {
        this.isdelete = isdelete;
    }
}