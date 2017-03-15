package com.colin.sports.core.service.impl;

import com.colin.sports.core.dao.TempDao;
import com.colin.sports.core.pojo.Temp;
import com.colin.sports.core.service.TempService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by colinx on 2017/3/15.
 */
@Service
@Transactional
public class TempServiceImpl implements TempService{

    @Autowired
    private TempDao tempDao;

    @Override
    public void insert(Temp temp) {
        tempDao.insert(temp);
    }
}
