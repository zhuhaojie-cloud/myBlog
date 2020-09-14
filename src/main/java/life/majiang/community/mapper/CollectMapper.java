package life.majiang.community.mapper;

import java.util.List;
import life.majiang.community.model.Collect;
import life.majiang.community.model.CollectExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface CollectMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table collect
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    long countByExample(CollectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table collect
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    int deleteByExample(CollectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table collect
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table collect
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    int insert(Collect record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table collect
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    int insertSelective(Collect record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table collect
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    List<Collect> selectByExampleWithRowbounds(CollectExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table collect
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    List<Collect> selectByExample(CollectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table collect
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    Collect selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table collect
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    int updateByExampleSelective(@Param("record") Collect record, @Param("example") CollectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table collect
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    int updateByExample(@Param("record") Collect record, @Param("example") CollectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table collect
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    int updateByPrimaryKeySelective(Collect record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table collect
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    int updateByPrimaryKey(Collect record);
}