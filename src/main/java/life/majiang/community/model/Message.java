package life.majiang.community.model;

public class Message {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message.id
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message.contact_id
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    private Long contactId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message.fromuser
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    private Long fromuser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message.touser
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    private Long touser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message.msg
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    private String msg;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message.time
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    private Long time;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message.readflag
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    private Integer readflag;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message.id
     *
     * @return the value of message.id
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message.id
     *
     * @param id the value for message.id
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message.contact_id
     *
     * @return the value of message.contact_id
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    public Long getContactId() {
        return contactId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message.contact_id
     *
     * @param contactId the value for message.contact_id
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    public void setContactId(Long contactId) {
        this.contactId = contactId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message.fromuser
     *
     * @return the value of message.fromuser
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    public Long getFromuser() {
        return fromuser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message.fromuser
     *
     * @param fromuser the value for message.fromuser
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    public void setFromuser(Long fromuser) {
        this.fromuser = fromuser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message.touser
     *
     * @return the value of message.touser
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    public Long getTouser() {
        return touser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message.touser
     *
     * @param touser the value for message.touser
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    public void setTouser(Long touser) {
        this.touser = touser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message.msg
     *
     * @return the value of message.msg
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    public String getMsg() {
        return msg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message.msg
     *
     * @param msg the value for message.msg
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    public void setMsg(String msg) {
        this.msg = msg == null ? null : msg.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message.time
     *
     * @return the value of message.time
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    public Long getTime() {
        return time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message.time
     *
     * @param time the value for message.time
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    public void setTime(Long time) {
        this.time = time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message.readflag
     *
     * @return the value of message.readflag
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    public Integer getReadflag() {
        return readflag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message.readflag
     *
     * @param readflag the value for message.readflag
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    public void setReadflag(Integer readflag) {
        this.readflag = readflag;
    }
}