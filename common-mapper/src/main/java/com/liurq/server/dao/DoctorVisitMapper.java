package com.liurq.server.dao;

import com.liurq.server.model.DoctorVisit;
import com.liurq.server.model.DoctorVisitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DoctorVisitMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_doctor_visit
     *
     * @mbggenerated Wed Feb 03 19:23:50 CST 2021
     */
    int countByExample(DoctorVisitExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_doctor_visit
     *
     * @mbggenerated Wed Feb 03 19:23:50 CST 2021
     */
    int deleteByExample(DoctorVisitExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_doctor_visit
     *
     * @mbggenerated Wed Feb 03 19:23:50 CST 2021
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_doctor_visit
     *
     * @mbggenerated Wed Feb 03 19:23:50 CST 2021
     */
    int insert(DoctorVisit record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_doctor_visit
     *
     * @mbggenerated Wed Feb 03 19:23:50 CST 2021
     */
    int insertSelective(DoctorVisit record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_doctor_visit
     *
     * @mbggenerated Wed Feb 03 19:23:50 CST 2021
     */
    List<DoctorVisit> selectByExample(DoctorVisitExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_doctor_visit
     *
     * @mbggenerated Wed Feb 03 19:23:50 CST 2021
     */
    DoctorVisit selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_doctor_visit
     *
     * @mbggenerated Wed Feb 03 19:23:50 CST 2021
     */
    int updateByExampleSelective(@Param("record") DoctorVisit record, @Param("example") DoctorVisitExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_doctor_visit
     *
     * @mbggenerated Wed Feb 03 19:23:50 CST 2021
     */
    int updateByExample(@Param("record") DoctorVisit record, @Param("example") DoctorVisitExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_doctor_visit
     *
     * @mbggenerated Wed Feb 03 19:23:50 CST 2021
     */
    int updateByPrimaryKeySelective(DoctorVisit record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_doctor_visit
     *
     * @mbggenerated Wed Feb 03 19:23:50 CST 2021
     */
    int updateByPrimaryKey(DoctorVisit record);
}