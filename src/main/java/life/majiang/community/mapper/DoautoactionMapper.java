package life.majiang.community.mapper;

import java.util.List;
import life.majiang.community.model.Doautoaction;
import life.majiang.community.model.DoautoactionExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface DoautoactionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doautoaction
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    long countByExample(DoautoactionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doautoaction
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    int deleteByExample(DoautoactionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doautoaction
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doautoaction
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    int insert(Doautoaction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doautoaction
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    int insertSelective(Doautoaction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doautoaction
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    List<Doautoaction> selectByExampleWithRowbounds(DoautoactionExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doautoaction
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    List<Doautoaction> selectByExample(DoautoactionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doautoaction
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    Doautoaction selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doautoaction
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    int updateByExampleSelective(@Param("record") Doautoaction record, @Param("example") DoautoactionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doautoaction
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    int updateByExample(@Param("record") Doautoaction record, @Param("example") DoautoactionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doautoaction
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    int updateByPrimaryKeySelective(Doautoaction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doautoaction
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    int updateByPrimaryKey(Doautoaction record);
}