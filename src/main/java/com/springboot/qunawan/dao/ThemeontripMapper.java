package com.springboot.qunawan.dao;

import com.springboot.qunawan.pojo.Themeontrip;

import java.util.List;

public interface ThemeontripMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table themeontrip
     *
     * @mbggenerated Mon Jun 17 11:23:14 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table themeontrip
     *
     * @mbggenerated Mon Jun 17 11:23:14 CST 2019
     */
    int insert(Themeontrip record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table themeontrip
     *
     * @mbggenerated Mon Jun 17 11:23:14 CST 2019
     */
    Themeontrip selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table themeontrip
     *
     * @mbggenerated Mon Jun 17 11:23:14 CST 2019
     */
    List<Themeontrip> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table themeontrip
     *
     * @mbggenerated Mon Jun 17 11:23:14 CST 2019
     */
    int updateByPrimaryKey(Themeontrip record);
}