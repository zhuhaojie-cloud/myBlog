package life.majiang.community.model;

import java.util.Date;

public class UserRedPacket {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userredpacket.id
     *
     * @mbg.generated Wed Aug 19 09:45:20 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userredpacket.red_packet_id
     *
     * @mbg.generated Wed Aug 19 09:45:20 CST 2020
     */
    private Long redPacketId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userredpacket.user_id
     *
     * @mbg.generated Wed Aug 19 09:45:20 CST 2020
     */
    private Long userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userredpacket.amount
     *
     * @mbg.generated Wed Aug 19 09:45:20 CST 2020
     */
    private Long amount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userredpacket.grab_date
     *
     * @mbg.generated Wed Aug 19 09:45:20 CST 2020
     */
    private Date grabDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userredpacket.note
     *
     * @mbg.generated Wed Aug 19 09:45:20 CST 2020
     */
    private String note;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userredpacket.id
     *
     * @return the value of userredpacket.id
     *
     * @mbg.generated Wed Aug 19 09:45:20 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userredpacket.id
     *
     * @param id the value for userredpacket.id
     *
     * @mbg.generated Wed Aug 19 09:45:20 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userredpacket.red_packet_id
     *
     * @return the value of userredpacket.red_packet_id
     *
     * @mbg.generated Wed Aug 19 09:45:20 CST 2020
     */
    public Long getRedPacketId() {
        return redPacketId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userredpacket.red_packet_id
     *
     * @param redPacketId the value for userredpacket.red_packet_id
     *
     * @mbg.generated Wed Aug 19 09:45:20 CST 2020
     */
    public void setRedPacketId(Long redPacketId) {
        this.redPacketId = redPacketId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userredpacket.user_id
     *
     * @return the value of userredpacket.user_id
     *
     * @mbg.generated Wed Aug 19 09:45:20 CST 2020
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userredpacket.user_id
     *
     * @param userId the value for userredpacket.user_id
     *
     * @mbg.generated Wed Aug 19 09:45:20 CST 2020
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userredpacket.amount
     *
     * @return the value of userredpacket.amount
     *
     * @mbg.generated Wed Aug 19 09:45:20 CST 2020
     */
    public Long getAmount() {
        return amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userredpacket.amount
     *
     * @param amount the value for userredpacket.amount
     *
     * @mbg.generated Wed Aug 19 09:45:20 CST 2020
     */
    public void setAmount(Long amount) {
        this.amount = amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userredpacket.grab_date
     *
     * @return the value of userredpacket.grab_date
     *
     * @mbg.generated Wed Aug 19 09:45:20 CST 2020
     */
    public Date getGrabDate() {
        return grabDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userredpacket.grab_date
     *
     * @param grabDate the value for userredpacket.grab_date
     *
     * @mbg.generated Wed Aug 19 09:45:20 CST 2020
     */
    public void setGrabDate(Date grabDate) {
        this.grabDate = grabDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userredpacket.note
     *
     * @return the value of userredpacket.note
     *
     * @mbg.generated Wed Aug 19 09:45:20 CST 2020
     */
    public String getNote() {
        return note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userredpacket.note
     *
     * @param note the value for userredpacket.note
     *
     * @mbg.generated Wed Aug 19 09:45:20 CST 2020
     */
    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }
}