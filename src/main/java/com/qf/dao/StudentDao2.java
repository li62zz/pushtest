package com.qf.dao;

import com.qf.bean.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

//public interface StudentDao2 extends PagingAndSortingRepository<Student,Integer> { }
public interface StudentDao2 extends JpaRepository<Student,Integer>, JpaSpecificationExecutor<Student> { }
