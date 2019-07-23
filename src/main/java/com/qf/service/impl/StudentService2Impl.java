package com.qf.service.impl;

import com.qf.bean.Student;
import com.qf.dao.StudentDao2;
import com.qf.service.StudentService2;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;

/**
 * 2019/7/2
 * Administrator
 * springdata0701
 * 面向对象面向君  不负代码不负卿
 */
@Service
public class StudentService2Impl implements StudentService2 {

    @Resource
    private StudentDao2 studentDao2;

    public Page<Student> findall(int index, int size) {
        Page<Student> all = studentDao2.findAll(new PageRequest(index, size, new Sort(Sort.Direction.DESC, "sid")));
        return all;
    }

    public List<Student> findall2(final int id,final String name) {

        Specification<Student> specification=
                new Specification<Student>(){
                    public Predicate toPredicate(Root<Student> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                      //  System.out.println(root.get("sid"));
                        //1.单个条件
                      /*  Predicate p1 = criteriaBuilder.equal(root.get("sid"), id);

                        return p1;*/
                        //多个条件
                        Predicate p1 = criteriaBuilder.equal(root.get("sid"), id);
                        Predicate p2 = criteriaBuilder.like(root.<String>get("sname"), name);
                        return criteriaBuilder.or(p1,p2);
                    }
                };


        List<Student> students = studentDao2.findAll(specification);
        return students;
    }
}
