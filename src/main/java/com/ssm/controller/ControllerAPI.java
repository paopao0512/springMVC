package com.ssm.controller;

import com.ssm.model.entity.Person;
import com.ssm.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/rest/api")
public class ControllerAPI {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    @ResponseBody
    public Person queryId (@PathVariable int id)throws Exception{
        return studentService.queryId(id);
    }

    @ResponseBody
    @RequestMapping(value = "/",method = RequestMethod.PUT,produces ="application/test;charset=utf-8")
    public String addUser(@RequestBody Person person)throws Exception{
        studentService.addUser(person);
        return "插入成功,id为: " + person.getId();
    }

    @ResponseBody
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public boolean deleteUser (@PathVariable int id)throws Exception{
        return studentService.deleteUser(id);
    }

    @ResponseBody
    @RequestMapping(value = "/{id}",method = RequestMethod.POST,produces = "application/text;charset=utf-8")
    public String updateUser(@PathVariable int id ,@RequestBody Person person)throws Exception{
        System.out.println("wwww" + person.toString() + id );
        return id + "的跟新状态：" + studentService.updateId(id,person);
    }
}
