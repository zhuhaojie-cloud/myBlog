package life.majiang.community.model;

public class Webroot {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column webroot.id
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column webroot.rolename
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    private String rolename;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column webroot.functionname
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    private String functionname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column webroot.gmt_create
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    private Long gmtCreate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column webroot.gmt_modified
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    private Long gmtModified;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column webroot.intro
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    private String intro;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column webroot.isdelete
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    private Integer isdelete;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column webroot.id
     *
     * @return the value of webroot.id
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column webroot.id
     *
     * @param id the value for webroot.id
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column webroot.rolename
     *
     * @return the value of webroot.rolename
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    public String getRolename() {
        return rolename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column webroot.rolename
     *
     * @param rolename the value for webroot.rolename
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    public void setRolename(String rolename) {
        this.rolename = rolename == null ? null : rolename.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column webroot.functionname
     *
     * @return the value of webroot.functionname
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    public String getFunctionname() {
        return functionname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column webroot.functionname
     *
     * @param functionname the value for webroot.functionname
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    public void setFunctionname(String functionname) {
        this.functionname = functionname == null ? null : functionname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column webroot.gmt_create
     *
     * @return the value of webroot.gmt_create
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    public Long getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column webroot.gmt_create
     *
     * @param gmtCreate the value for webroot.gmt_create
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    public void setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column webroot.gmt_modified
     *
     * @return the value of webroot.gmt_modified
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    public Long getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column webroot.gmt_modified
     *
     * @param gmtModified the value for webroot.gmt_modified
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    public void setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column webroot.intro
     *
     * @return the value of webroot.intro
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    public String getIntro() {
        return intro;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column webroot.intro
     *
     * @param intro the value for webroot.intro
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    public void setIntro(String intro) {
        this.intro = intro == null ? null : intro.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column webroot.isdelete
     *
     * @return the value of webroot.isdelete
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    public Integer getIsdelete() {
        return isdelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column webroot.isdelete
     *
     * @param isdelete the value for webroot.isdelete
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    public void setIsdelete(Integer isdelete) {
        this.isdelete = isdelete;
    }
}