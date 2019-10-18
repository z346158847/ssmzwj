package com.zwj.entity;

import lombok.Data;

import java.util.Date;

@Data
public class SysUserEntity {
    /**
     * id
     */
    private Long id;
    /**
     * 名字
     */
    private String name;
    /**
     * 年龄
     */
    private int age;
    /**
     * 创建时间
     */
    private Date createTime;
}
