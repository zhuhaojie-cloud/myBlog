package life.majiang.community.mapper;

import java.util.List;
import life.majiang.community.model.Autoactiondo;
import life.majiang.community.model.AutoactiondoExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface AutoactiondoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table autoactiondo
     *
     * @mbg.generated Tue Sep 01 11:21:31 CST 2020
     */
    long countByExample(AutoactiondoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table autoactiondo
     *
     * @mbg.generated Tue Sep 01 11:21:31 CST 2020
     */
    int deleteByExample(AutoactiondoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table autoactiondo
     *
     * @mbg.generated Tue Sep 01 11:21:31 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table autoactiondo
     *
     * @mbg.generated Tue Sep 01 11:21:31 CST 2020
     */
    int insert(Autoactiondo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table autoactiondo
     *
     * @mbg.generated Tue Sep 01 11:21:31 CST 2020
     */
    int insertSelective(Autoactiondo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table autoactiondo
     *
     * @mbg.generated Tue Sep 01 11:21:31 CST 2020
     */
    List<Autoactiondo> selectByExampleWithRowbounds(AutoactiondoExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table autoactiondo
     *
     * @mbg.generated Tue Sep 01 11:21:31 CST 2020
     */
    List<Autoactiondo> selectByExample(AutoactiondoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table autoactiondo
     *
     * @mbg.generated Tue Sep 01 11:21:31 CST 2020
     */
    Autoactiondo selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table autoactiondo
     *
     * @mbg.generated Tue Sep 01 11:21:31 CST 2020
     */
    int updateByExampleSelective(@Param("record") Autoactiondo record, @Param("example") AutoactiondoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table autoactiondo
     *
     * @mbg.generated Tue Sep 01 11:21:31 CST 2020
     */
    int updateByExample(@Param("record") Autoactiondo record, @Param("example") AutoactiondoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table autoactiondo
     *
     * @mbg.generated Tue Sep 01 11:21:31 CST 2020
     */
    int updateByPrimaryKeySelective(Autoactiondo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table autoactiondo
     *
     * @mbg.generated Tue Sep 01 11:21:31 CST 2020
     */
    int updateByPrimaryKey(Autoactiondo record);
}