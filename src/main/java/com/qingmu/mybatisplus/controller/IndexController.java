package com.qingmu.mybatisplus.controller;

import com.qingmu.mybatisplus.annotion.History;
import com.qingmu.mybatisplus.entity.User;
import com.qingmu.mybatisplus.entity.UserRes;
import com.qingmu.mybatisplus.service.impl.RestTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
public class IndexController {


    @Autowired
    private RestTemplateService restTemplateService;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public User test() {
        User user = new User();
        user.setAge(25);
//        user.setName("阿达");
        ResponseEntity<UserRes> userResponseEntity = restTemplateService.basicRestRequest("http://localhost:8001/test2", user,HttpMethod.POST, UserRes.class);
        UserRes body = userResponseEntity.getBody();
        System.out.println(body.toString());
        return user;
    }

    @RequestMapping(value = "/test2", method = RequestMethod.POST)
    public UserRes test2(@RequestBody  User user) {
        System.out.println("test2"+user.toString());
        UserRes user2 = new UserRes();
        user2.setAge(user.getAge());
        user2.setName(user.getName());
        user2.setCreatTm(user.getCreatTm());
        return user2;
    }
}