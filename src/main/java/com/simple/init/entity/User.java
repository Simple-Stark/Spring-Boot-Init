package com.simple.init.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户实体类
 * @author Simple
 * @date 2021/10/3 15:39
 */
@Data
public class User implements Serializable {
    private static final long serialVersionUID = 6280578936847452848L;

    private String name;

    private String sex;

    private String sexCode;

    private Integer age;
}
