package com.qingmu.mybatisplus.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Description：
 *
 * @author lida
 * @date: created in 2020-11-21 5:28 下午
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class UserMapp {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void test1(){
        String name="Jack";
        userMapper.selectByName(name);
    }  @Test
    public void test2(){
        String name="Jack";
        userMapper.selectByName2(name);
    }
}
