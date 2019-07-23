package com.qf.service;

import com.qf.bean.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface StudentService2 {
    public Page<Student> findall(int index, int size);
    //条件查询
    public List<Student> findall2(int id,String name);
}
