package com.ssm.controller;

import com.ssm.model.entity.Person;
import com.ssm.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/rest")
public class ControllerREST {

    @Autowired
    private StudentService studentService;

    //增
    @RequestMapping(value = "/",method = RequestMethod.PUT,produces = "application/test;charset=utf-8")
    public String addUser(Person person)throws Exception{
        System.out.println(person);
        studentService.addUser(person);
        return "redirect:/rest/user/";
    }

    //删
    @ResponseBody
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public boolean delete(@PathVariable int id)throws Exception{
        System.out.println(id);
        return studentService.deleteUser(id);
    }

    //查
    //显示所有

    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public String queryUser(Person person,Model model)throws Exception{
        List<Person> person1 = studentService.queryUser(person);
        model.addAttribute("itemsList",person1);
        return "CRUD/Show2";
    }

    //根据名字查询
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public ModelAndView queryName(String name)throws Exception{
        System.out.println("wwwwwwwwww");
        List<Person> person1 = studentService.queryName(name);
        System.out.println(person1.toString());
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("itemsList",person1);
        modelAndView.setViewName("CRUD/Show2");
        return modelAndView;
    }

    //改
    @RequestMapping(value = "/{id}",method = RequestMethod.POST,produces = "application/test;charset=utf-8")
    public String updateUser(@PathVariable int id,Person person)throws Exception{
        System.out.println(person.toString());
        studentService.updateId(id,person) ;
        return "redirect:/rest/user/";
    }

    //根据ID跳转页面
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public String queryId (@PathVariable int id, Model model)throws Exception {
        Person person = studentService.queryId(id);
        model.addAttribute("itemsList",person);
        return "CRUD/Update2";
    }
}
