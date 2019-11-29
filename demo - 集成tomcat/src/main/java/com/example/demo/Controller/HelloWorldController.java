package com.example.demo.Controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import com.example.demo.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: rc
 * @create: 2019/11/22 15:37
 */
@RestController
public class HelloWorldController {

    @Autowired
    private UserServiceImpl userService;

    @RequestMapping("/hello")
    public String index(){
        return "Hello World";
    }

    @RequestMapping("/get")
    public List getUser(){
        List<User> users = userService.selectList(null);
        return users;
    }
}
