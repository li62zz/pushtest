package com.qf.dao;

import com.qf.bean.Grade;
import com.qf.bean.Student;
import org.springframework.data.repository.Repository;

public interface GradeDao   extends Repository<Grade,Integer> {
    //根据年级id查询年级信息(包含学生信息)
    public Grade findByCid(int cid);
}
