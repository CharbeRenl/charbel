package com.example.demo.service.impl;

import com.example.demo.model.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author rc
 * @since 2019-11-22
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
