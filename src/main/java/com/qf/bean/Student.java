package com.qf.bean;

import javax.persistence.*;

/**
 * 2019/7/2
 * Administrator
 * springdata0701
 * 面向对象面向君  不负代码不负卿
 */
//多方
@Entity
public class Student {
    @Id
    private Integer sid;
    @Column
    private String sname;
    @Column
    private String sex;

    @ManyToOne
    @JoinColumn(name = "gid")
    private Grade grade;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }
}
