package com.qf.bean;

import javax.persistence.*;

/**
 * 2019/7/2
 * Administrator
 * springdata0701
 * 面向对象面向君  不负代码不负卿
 */
@Entity
public class Wife {
    @Id
    private Integer wifeId;
    @Column
    private String wifeName;

    @OneToOne
    @JoinColumn(name = "hid")
    private Husband husband;

    public Integer getWifeId() {
        return wifeId;
    }

    public void setWifeId(Integer wifeId) {
        this.wifeId = wifeId;
    }

    public String getWifeName() {
        return wifeName;
    }

    public void setWifeName(String wifeName) {
        this.wifeName = wifeName;
    }

    public Husband getHusband() {
        return husband;
    }

    public void setHusband(Husband husband) {
        this.husband = husband;
    }
}
