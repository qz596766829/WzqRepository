package com.wzq.log.controller;

import com.wzq.log.annotation.Log;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@RestController
public class TestController {

    @GetMapping("/list")
    @Log("获取Student列表")
    public List list() {
        List list = new ArrayList();
        for(int i = 0 ; i < 10 ; i++){
            Student student = new Student();
            student.setId(i);
            student.setName("name"+i);
            list.add(student);
        }
        return list;
    }

    @GetMapping("/getone")
    @Log("获取Student")
    public Student success() {
        Student student = new Student();
        student.setId(10);
        student.setName("name"+10);
        return student;
    }

}

class Student implements Serializable {
    private Integer id;
    private String name;

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
}
