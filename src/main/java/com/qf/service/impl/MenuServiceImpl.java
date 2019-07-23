package com.qf.service.impl;

import com.qf.bean.Menu;
import com.qf.dao.MenuDao;
import com.qf.service.MenuService;
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
@Service("menuservice")
public class MenuServiceImpl implements MenuService {
    @Resource
    private MenuDao menuDao;
    public List<Menu> findmenus() {
        Iterable<Menu> all = menuDao.findAll();
        Iterator<Menu> iterator = all.iterator();
        List list=new ArrayList();
        while(iterator.hasNext()){
            Menu next = iterator.next();
            list.add(next);
        }
        return list;
    }
}
