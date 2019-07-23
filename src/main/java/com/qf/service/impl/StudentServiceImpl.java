package com.qf.service.impl;

import com.qf.bean.Grade;
import com.qf.bean.Student;
import com.qf.dao.GradeDao;
import com.qf.dao.StudentDao;
import com.qf.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 2019/7/2
 * Administrator
 * springdata0701
 * 面向对象面向君  不负代码不负卿
 */
@Service("stuservice")
public class StudentServiceImpl implements StudentService {

    @Resource
    private GradeDao gradeDao;

    public List<Student> findstus(int sid, String sname) {
        return studentDao.findstudents(sid, sname);
    }

    public int delete(int id) {
        return studentDao.delete(id);
    }

    @Resource
    private StudentDao studentDao;


    public Grade findByCid(int cid) {
        return gradeDao.findByCid(cid);
    }

    public Student findBySid(int sid) {
        return studentDao.findBySid(sid);
    }

    public List<Student> findByGrade_Cname(String cname) {

        //return studentDao.findByGrade_Cname(cname);
        return studentDao.findgradename(cname);
    }
}
