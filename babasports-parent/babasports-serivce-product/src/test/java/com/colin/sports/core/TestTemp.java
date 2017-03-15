package com.colin.sports.core;

import com.colin.sports.core.dao.TempDao;
import com.colin.sports.core.pojo.Temp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

/**
 * Created by colinx on 2017/3/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:application-context.xml"})
public class TestTemp {

    @Autowired
    private TempDao tempDao;

    @Test
    public void testInstert() {
        Temp temp = new Temp();
        temp.setId(1);
        temp.setName("是否");
        temp.setBirthday(new Date());
        tempDao.insert(temp);
    }
}
