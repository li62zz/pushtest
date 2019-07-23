package com.qf.service.impl;

import com.qf.bean.Menu;
import com.qf.bean.Wife;
import com.qf.dao.WifeDao;
import com.qf.service.WifeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 2019/7/2
 * Administrator
 * springdata0701
 * 面向对象面向君  不负代码不负卿
 */
@Service("wifeservice")
public class WifeServiceImpl implements WifeService {

    @Resource
    private WifeDao wifeDao;

    public List<Wife> getwifes() {
        Iterable<Wife> all = wifeDao.findAll();
        Iterator<Wife> iterator = all.iterator();
        List list=new ArrayList();
        while(iterator.hasNext()){
            Wife next = iterator.next();
            list.add(next);
        }
        return list;
    }
}
