package com.example.demo;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

/**
 * @author: rc
 * @create: 2019/11/22 16:31
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootMybatisPlusApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    public void contextLoads() {

        // 所有用户
//        List<User> users = userService.selectList(null);
//        System.out.println(users);



    }

}
