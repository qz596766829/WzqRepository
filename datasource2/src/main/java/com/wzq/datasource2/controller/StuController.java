package com.wzq.datasource2.controller;

import com.wzq.datasource2.entity.cluster.StuT;
import com.wzq.datasource2.entity.master.Stu;
import com.wzq.datasource2.service.cluster.StuTService;
import com.wzq.datasource2.service.master.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class StuController {

    @Autowired
    @Qualifier(value = "stuServiceImpl")
    private StuService stuService;

    @Autowired
    @Qualifier(value = "stuTServiceImpl")
    private StuTService stuTService;

    @RequestMapping("/list")
    @ResponseBody
    public List<Stu> getAllStu(){
        return stuService.getAllStu();
    }
    @RequestMapping("/list2")
    @ResponseBody
    public List<StuT> getAllStuT(){
        return stuTService.getAllStuT();
    }

}
