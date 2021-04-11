package com.lmafia.springbootlabs.bean;

import lombok.Data;

/**
 * @author L_MaFia
 * @classname User.java
 * @description TODO
 * @date 2021/2/27
 */
@Data
public class User {
    private Integer id;
    private String name;
    private Integer age;
    private String sex;
    private String email;
    private String phoneNumber;
    private String createTime;
    private String labels;
}
