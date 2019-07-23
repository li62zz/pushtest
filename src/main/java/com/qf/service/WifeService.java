package com.qf.service;

import com.qf.bean.Wife;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * 2019/7/2
 * Administrator
 * springdata0701
 * 面向对象面向君  不负代码不负卿
 */
public interface WifeService {

    public List<Wife> getwifes();
}
