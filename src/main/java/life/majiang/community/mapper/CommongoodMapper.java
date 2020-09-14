package life.majiang.community.mapper;

import java.util.List;
import life.majiang.community.model.Commongood;
import life.majiang.community.model.CommongoodExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface CommongoodMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commongood
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    long countByExample(CommongoodExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commongood
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    int deleteByExample(CommongoodExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commongood
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commongood
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    int insert(Commongood record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commongood
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    int insertSelective(Commongood record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commongood
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    List<Commongood> selectByExampleWithRowbounds(CommongoodExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commongood
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    List<Commongood> selectByExample(CommongoodExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commongood
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    Commongood selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commongood
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    int updateByExampleSelective(@Param("record") Commongood record, @Param("example") CommongoodExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commongood
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    int updateByExample(@Param("record") Commongood record, @Param("example") CommongoodExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commongood
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    int updateByPrimaryKeySelective(Commongood record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commongood
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    int updateByPrimaryKey(Commongood record);
}