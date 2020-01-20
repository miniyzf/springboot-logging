package com.example.demo.controller;

import com.alibaba.fastjson.JSON;
import com.example.demo.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * UserController
 *
 * @author Administrator
 * @date 2020/1/18
 */
@Slf4j
@Controller
public class UserController {

    @RequestMapping("/")
    public @ResponseBody String findUser(){
        User user = new User();
        user.setUserName("张三");
        user.setAge(22);
        log.info(user.toString());
        return JSON.toJSONString(user);
    }
}
