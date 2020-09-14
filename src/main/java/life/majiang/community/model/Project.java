package life.majiang.community.model;

public class Project {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column project.id
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column project.project_name
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    private String projectName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column project.gmt_modified
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    private Long gmtModified;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column project.gmt_create
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    private Long gmtCreate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column project.open
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    private Integer open;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column project.url
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    private String url;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column project.id
     *
     * @return the value of project.id
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column project.id
     *
     * @param id the value for project.id
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column project.project_name
     *
     * @return the value of project.project_name
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column project.project_name
     *
     * @param projectName the value for project.project_name
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    public void setProjectName(String projectName) {
        this.projectName = projectName == null ? null : projectName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column project.gmt_modified
     *
     * @return the value of project.gmt_modified
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    public Long getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column project.gmt_modified
     *
     * @param gmtModified the value for project.gmt_modified
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    public void setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column project.gmt_create
     *
     * @return the value of project.gmt_create
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    public Long getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column project.gmt_create
     *
     * @param gmtCreate the value for project.gmt_create
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    public void setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column project.open
     *
     * @return the value of project.open
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    public Integer getOpen() {
        return open;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column project.open
     *
     * @param open the value for project.open
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    public void setOpen(Integer open) {
        this.open = open;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column project.url
     *
     * @return the value of project.url
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column project.url
     *
     * @param url the value for project.url
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }
}