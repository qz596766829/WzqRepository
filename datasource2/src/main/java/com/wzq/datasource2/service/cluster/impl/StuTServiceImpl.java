package com.wzq.datasource2.service.cluster.impl;

import com.wzq.datasource2.mapper.cluster.StuTMapper;
import com.wzq.datasource2.entity.cluster.StuT;
import com.wzq.datasource2.service.cluster.StuTService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StuTServiceImpl implements StuTService {

    @Autowired
    private StuTMapper stuTMapper;

    @Override
    public List<StuT> getAllStuT() {
        return stuTMapper.getAllStuT();
    }
}
