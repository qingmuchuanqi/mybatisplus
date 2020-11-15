package com.qingmu.mybatisplus.controller;

import com.qingmu.mybatisplus.entity.User;
import com.qingmu.mybatisplus.entity.UserRes;
import com.qingmu.mybatisplus.service.impl.RestTemplateService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
private static final Logger logger = LoggerFactory.getLogger(IndexController.class);


    @Autowired
    private RestTemplateService restTemplateService;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public User test() {
        User user = new User();
        user.setAge(25);
        user.setName("阿达");
        ResponseEntity<UserRes> userResponseEntity = restTemplateService.basicRestRequest("http://localhost:8001/test2", user,HttpMethod.POST, UserRes.class);
        UserRes body = userResponseEntity.getBody();
        logger.info("[basicRestRequest] result: {}",body.toString());
        return user;
    }

    @RequestMapping(value = "/test2", method = RequestMethod.POST)
    public UserRes test2(@RequestBody  User user) {
        logger.info("[test2] reqParams: {}"+user.toString());
        UserRes user2 = new UserRes();
        user2.setAge(user.getAge());
        user2.setName(user.getName());
        user2.setCreatTm(user.getCreatTm());
        return user2;
    }

    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public void save(@RequestBody User user){

    }
}