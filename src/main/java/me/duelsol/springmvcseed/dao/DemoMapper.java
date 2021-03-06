package me.duelsol.springmvcseed.dao;

import java.util.List;
import me.duelsol.springmvcseed.model.Demo;
import me.duelsol.springmvcseed.model.DemoExample;
import org.apache.ibatis.annotations.Param;

public interface DemoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table springmvc_demo
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table springmvc_demo
     *
     * @mbg.generated
     */
    int insert(Demo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table springmvc_demo
     *
     * @mbg.generated
     */
    int insertSelective(Demo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table springmvc_demo
     *
     * @mbg.generated
     */
    List<Demo> selectByExample(DemoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table springmvc_demo
     *
     * @mbg.generated
     */
    Demo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table springmvc_demo
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    Demo selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table springmvc_demo
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Demo record, @Param("example") DemoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table springmvc_demo
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Demo record, @Param("example") DemoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table springmvc_demo
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Demo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table springmvc_demo
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Demo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table springmvc_demo
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int batchInsert(@Param("list") List<Demo> list);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table springmvc_demo
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int batchInsertSelective(@Param("list") List<Demo> list, @Param("selective") Demo.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table springmvc_demo
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByExample(@Param("example") DemoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table springmvc_demo
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByPrimaryKey(Integer id);
}