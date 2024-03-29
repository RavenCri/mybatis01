package com.raven.dao;

import com.raven.pojo.Code;
import com.raven.pojo.CodeExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface CodeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_code
     *
     * @mbg.generated Fri Mar 08 21:17:03 CST 2015
     */
    long countByExample(CodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_code
     *
     * @mbg.generated Fri Mar 08 21:17:03 CST 2015
     */
    int deleteByExample(CodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_code
     *
     * @mbg.generated Fri Mar 08 21:17:03 CST 2015
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_code
     *
     * @mbg.generated Fri Mar 08 21:17:03 CST 2015
     */
    int insert(Code record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_code
     *
     * @mbg.generated Fri Mar 08 21:17:03 CST 2015
     */
    int insertSelective(Code record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_code
     *
     * @mbg.generated Fri Mar 08 21:17:03 CST 2015
     */
    List<Code> selectByExample(CodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_code
     *
     * @mbg.generated Fri Mar 08 21:17:03 CST 2015
     */
    Code selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_code
     *
     * @mbg.generated Fri Mar 08 21:17:03 CST 2015
     */
    int updateByExampleSelective(@Param("record") Code record, @Param("example") CodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_code
     *
     * @mbg.generated Fri Mar 08 21:17:03 CST 2015
     */
    int updateByExample(@Param("record") Code record, @Param("example") CodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_code
     *
     * @mbg.generated Fri Mar 08 21:17:03 CST 2015
     */
    int updateByPrimaryKeySelective(Code record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_code
     *
     * @mbg.generated Fri Mar 08 21:17:03 CST 2015
     */
    int updateByPrimaryKey(Code record);
}