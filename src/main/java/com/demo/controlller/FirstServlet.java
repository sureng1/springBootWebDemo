package com.demo.controlller;

import com.demo.Student;
import com.demo.entity.User;
import com.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/helpapp")
public class FirstServlet {

    @RequestMapping("/firstservlet")
    @ResponseBody
    public String home() {
        Student student = Student.getStuden();
        return "<h1>学号："+student.getSno()+"</h1>"+"<tr>"+"<h1>名字："+student.getName()+"</h1>";
    }
    @Autowired
    UserService userService;
    @RequestMapping("/getinfo")
    @ResponseBody
    public String user() {
        User user = userService.findUserByName("苏宇泉");
        return "<h1>学号："+user.getId()+"</h1><br>姓名<h1>"+user.getName()+"</h1>";
    }
    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/setinfo")
    @ResponseBody
    public String setInfo(@RequestParam(value="id") int id,@RequestParam(value = "name") String name){
        Student student = Student.getStuden();
        student.setStudent(id,name);
        return "<h1>success</h1>";
    }

//    public static void main(String[] args) throws Exception {
//        SpringApplication.run(FirstServlet.class, args);
//    }

}
