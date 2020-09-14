package life.majiang.community.mapper;

import java.util.List;
import life.majiang.community.model.Webroot;
import life.majiang.community.model.WebrootExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface WebrootMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table webroot
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    long countByExample(WebrootExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table webroot
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    int deleteByExample(WebrootExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table webroot
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table webroot
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    int insert(Webroot record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table webroot
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    int insertSelective(Webroot record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table webroot
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    List<Webroot> selectByExampleWithRowbounds(WebrootExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table webroot
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    List<Webroot> selectByExample(WebrootExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table webroot
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    Webroot selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table webroot
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    int updateByExampleSelective(@Param("record") Webroot record, @Param("example") WebrootExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table webroot
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    int updateByExample(@Param("record") Webroot record, @Param("example") WebrootExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table webroot
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    int updateByPrimaryKeySelective(Webroot record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table webroot
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    int updateByPrimaryKey(Webroot record);
}