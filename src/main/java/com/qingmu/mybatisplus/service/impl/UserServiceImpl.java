package com.qingmu.mybatisplus.service.impl;

import com.qingmu.mybatisplus.entity.User;
import com.qingmu.mybatisplus.mapper.UserMapper;
import com.qingmu.mybatisplus.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 
 * @since 2020-11-14
 * Copyright (C), 2017-2019, 网联商务
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>implements UserService {
}
