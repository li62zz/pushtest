package com.qf.bean;

import javax.persistence.*;
import java.util.List;

/**
 * 2019/7/2
 * Administrator
 * springdata0701
 * 面向对象面向君  不负代码不负卿
 */
@Entity
public class Role {
    @Id
    private Integer roleId;
    @Column
    private String rname;

    @ManyToMany
    @JoinTable(name="middle",
            joinColumns={@JoinColumn(name="roleid")},
            inverseJoinColumns={@JoinColumn(name="menuid")})
    private List<Menu> menuList;


    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public List<Menu> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<Menu> menuList) {
        this.menuList = menuList;
    }
}
