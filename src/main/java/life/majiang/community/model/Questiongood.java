package life.majiang.community.model;

public class Questiongood {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column questiongood.id
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column questiongood.question_id
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    private Long questionId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column questiongood.creat_gmt
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    private Long creatGmt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column questiongood.user_id
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    private Long userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column questiongood.user_name
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    private String userName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column questiongood.up_id
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    private Long upId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column questiongood.id
     *
     * @return the value of questiongood.id
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column questiongood.id
     *
     * @param id the value for questiongood.id
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column questiongood.question_id
     *
     * @return the value of questiongood.question_id
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    public Long getQuestionId() {
        return questionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column questiongood.question_id
     *
     * @param questionId the value for questiongood.question_id
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column questiongood.creat_gmt
     *
     * @return the value of questiongood.creat_gmt
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    public Long getCreatGmt() {
        return creatGmt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column questiongood.creat_gmt
     *
     * @param creatGmt the value for questiongood.creat_gmt
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    public void setCreatGmt(Long creatGmt) {
        this.creatGmt = creatGmt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column questiongood.user_id
     *
     * @return the value of questiongood.user_id
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column questiongood.user_id
     *
     * @param userId the value for questiongood.user_id
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column questiongood.user_name
     *
     * @return the value of questiongood.user_name
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column questiongood.user_name
     *
     * @param userName the value for questiongood.user_name
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column questiongood.up_id
     *
     * @return the value of questiongood.up_id
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    public Long getUpId() {
        return upId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column questiongood.up_id
     *
     * @param upId the value for questiongood.up_id
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    public void setUpId(Long upId) {
        this.upId = upId;
    }
}