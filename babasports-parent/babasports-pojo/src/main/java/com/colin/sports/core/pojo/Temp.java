package com.colin.sports.core.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by colinx on 2017/3/15.
 */
public class Temp implements Serializable{

    private Integer id;

    private String name;

    private Date birthday;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
