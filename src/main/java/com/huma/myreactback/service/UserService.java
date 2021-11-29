package com.huma.myreactback.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.huma.myreactback.domain.User;

/**
 * @author hudenian
 * @date 2021/11/29
 */
public interface UserService extends IService<User> {
    /**
     * @param userName 用户名
     * @param password 密码
     * @return 用户
     */
    User login(String userName, String password);
}
