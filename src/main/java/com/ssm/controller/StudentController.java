package com.ssm.controller;

import com.ssm.model.entity.Person;
import com.ssm.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/queryName")
    public ModelAndView queryName(HttpServletRequest request, Person person) throws Exception{
        //调用service查找数据库，查询商品列表
        System.out.println(person.toString());
        List<Person> person2=studentService.queryName(person.getName());
        /*if (person2 != null){
            System.out.println(person2.getName());
        } else {
            System.out.println("wu ");
        }*/

        //返回ModelAndView
        ModelAndView modelAndView = new ModelAndView();
        //指定视图
        //modelAndView.setViewName("/WEB-INF/jsp/items/itemsList.jsp");
        //下边的路径，如果在视图解析器中配置jsp路径的前缀和jsp路径的后缀，修改为;
        modelAndView.addObject("itemsList",  person2);
        modelAndView.setViewName("Show");
        return modelAndView;
    }

    //修改信息页面跳转
    @RequestMapping("/editItem")
    public ModelAndView editItem(HttpServletRequest request, Person person) throws Exception{
        Person person1 = studentService.queryId(person.getId());

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("itemsList",person1);
        modelAndView.setViewName("Update");
        return modelAndView;
    }

    //提交修改信息
    @RequestMapping("/editItemsSubmit")
    public String editItemsSubmit(Person person) throws Exception{
        if (studentService.updateUser(person)){
            System.out.println("操作成功");
            return "/end/Success";
        }
        System.out.println(person.toString());
        System.out.println("失败");
        return "/end/loser";
    }

    //新增信息
    @RequestMapping("/addStudent")
    public String addStudent(Person person) throws Exception{
        if(person != null){
            studentService.addUser(person);
            return "/end/Success";
        }
        System.out.println(person.toString());
        return "/end/loser";
    }
    //打开新增信息页面
    @RequestMapping("/add")
    public ModelAndView addJsp(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("add");
        return modelAndView;
    }

    //删除信息
    @RequestMapping("/deleteItem")
    public String deleteItem(Person person) throws Exception{
        System.out.println(person.getId());
        if(person != null) {
            studentService.deleteUser(person.getId());
            return "/end/Success";
        }
        System.out.println("失败");
        return "/end/loser";
    }

    @ResponseBody
    @RequestMapping("/json/{id}")
    public Person json(@PathVariable int id) throws Exception{
         return studentService.queryId(id);
    }
}
