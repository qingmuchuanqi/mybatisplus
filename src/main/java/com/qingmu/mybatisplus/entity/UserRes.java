package com.qingmu.mybatisplus.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;

import java.io.Serializable;
import java.time.LocalDateTime;


public class UserRes implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    private Long id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 邮箱
     */
    private String email;

    @TableField(value = "creatTm",fill = FieldFill.INSERT)
    private LocalDateTime creatTm;

    @TableField(value = "updateTm",fill = FieldFill.UPDATE)
    private LocalDateTime updateTm;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDateTime getCreatTm() {
        return creatTm;
    }

    public void setCreatTm(LocalDateTime creatTm) {
        this.creatTm = creatTm;
    }

    public LocalDateTime getUpdateTm() {
        return updateTm;
    }

    public void setUpdateTm(LocalDateTime updateTm) {
        this.updateTm = updateTm;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name=" + name +
                ", age=" + age +
                ", email=" + email +
                ", creatTm=" + creatTm +
                ", updateTm=" + updateTm +
                "}";
    }
}