package com.wzq.datasource2.service.master.impl;

import com.wzq.datasource2.mapper.master.StuMapper;
import com.wzq.datasource2.entity.master.Stu;
import com.wzq.datasource2.service.master.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StuServiceImpl implements StuService {

    @Autowired
    private StuMapper stuDao;

    @Override
    public List<Stu> getAllStu() {

        System.out.println("StuServiceImpl");

        return stuDao.getAllStu();
    }
}
