package com.coderhua.user.controller;

import com.alibaba.fastjson.JSONObject;
import com.coderhua.user.domain.entity.User;
import com.coderhua.user.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Create By IntelliJ IDEA
 *
 * @author XieHua
 * @date 2020-01-19
 */
@RestController
@RequestMapping(value = "/api/v1")
public class UserController {
    @Resource
    private UserService userService;

    @GetMapping(value = "/user/{username}")
    public String getByUsername(@PathVariable("username") String username) {
        User user = userService.getByUsername(username);
        return JSONObject.toJSONString(user);
    }
}
