package com.coderhua.user.service;

import com.coderhua.user.domain.entity.User;

/**
 * Create By IntelliJ IDEA
 *
 * @author XieHua
 * @date 2020-01-19
 */
public interface UserService {
    User getByUsername(String username);
}
