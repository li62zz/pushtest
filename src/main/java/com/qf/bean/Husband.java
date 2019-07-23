package com.qf.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * 2019/7/2
 * Administrator
 * springdata0701
 * 面向对象面向君  不负代码不负卿
 */
@Entity
public class Husband {
    @Id
    private Integer husId;
    @Column
    private String husName;

    @OneToOne(mappedBy = "husband")
    private Wife wife;

    public Integer getHusId() {
        return husId;
    }

    public void setHusId(Integer husId) {
        this.husId = husId;
    }

    public String getHusName() {
        return husName;
    }

    public void setHusName(String husName) {
        this.husName = husName;
    }

    public Wife getWife() {
        return wife;
    }

    public void setWife(Wife wife) {
        this.wife = wife;
    }
}
