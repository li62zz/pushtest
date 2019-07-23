package com.qf.service;

import com.qf.bean.Grade;
import com.qf.bean.Student;

import java.util.List;

public interface StudentService {
    //根据年级id查询年级信息(包含学生信息)
    public Grade findByCid(int cid);
    //根据学生id查询学生信息(包含年级信息)
    public Student findBySid(int sid);
    //现在有一个年级名称，需要查询出该年级的学生信息
    public List<Student> findByGrade_Cname(String cname);
    public List<Student> findstus(int sid,String sname);
    public int delete(int id);
}
