package life.majiang.community.mapper;

import java.util.List;
import life.majiang.community.model.Integral;
import life.majiang.community.model.IntegralExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface IntegralMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table integral
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    long countByExample(IntegralExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table integral
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    int deleteByExample(IntegralExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table integral
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table integral
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    int insert(Integral record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table integral
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    int insertSelective(Integral record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table integral
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    List<Integral> selectByExampleWithRowbounds(IntegralExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table integral
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    List<Integral> selectByExample(IntegralExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table integral
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    Integral selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table integral
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    int updateByExampleSelective(@Param("record") Integral record, @Param("example") IntegralExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table integral
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    int updateByExample(@Param("record") Integral record, @Param("example") IntegralExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table integral
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    int updateByPrimaryKeySelective(Integral record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table integral
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    int updateByPrimaryKey(Integral record);
}