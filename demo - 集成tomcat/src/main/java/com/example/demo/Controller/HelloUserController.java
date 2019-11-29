package com.example.demo.Controller;

import com.example.demo.model.User;
import com.example.demo.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: rc
 * @create: 2019/11/22 17:16
 */
@RestController
@RequestMapping("/user")
public class HelloUserController {

    @Autowired
    private UserServiceImpl userService;

    @RequestMapping("/insert")
    public String insertUser(String id, String name){
        try {
            User user = new User();
            user.setName(name);
            userService.insert(user);
            return "true";
        }catch (Exception e){
            e.printStackTrace();
            return e.getMessage();
        }

    }
}
