package com.coderhua.user.service.impl;

import com.coderhua.user.domain.entity.User;
import com.coderhua.user.mapper.UserMapper;
import com.coderhua.user.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Create By IntelliJ IDEA
 *
 * @author XieHua
 * @date 2020-01-19
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public User getByUsername(String username) {
        return userMapper.getByUsername(username);
    }
}
