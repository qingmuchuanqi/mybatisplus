package com.qingmu.mybatisplus.service;

import com.qingmu.mybatisplus.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Description：
 *
 * @author lida
 * @date: created in 2020-11-14 2:33 下午
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void fillCreateTest() {
        User user = new User();
        user.setAge(11);
        user.setName("小明");
        user.setEmail("12212@qq.com");
        boolean save = userService.save(user);
    }

    @Test
    public void fillUpdateTest() {
        User user = new User();
        user.setId(1L);
        user.setAge(11);
        user.setName("小明");
        user.setEmail("12212@qq.com");
        boolean update = userService.updateById(user);
    }


}
