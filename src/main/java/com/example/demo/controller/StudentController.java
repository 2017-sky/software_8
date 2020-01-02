package com.example.demo.controller;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 *
 */
@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping("/index")
    public String getIndex(){
        return "index";
    }

    @RequestMapping("/get")
    public String getList(Map<String,Object> map){
        map.put("list",studentService.getList());
        return "list";
    }
}
