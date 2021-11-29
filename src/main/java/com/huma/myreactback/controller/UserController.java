package com.huma.myreactback.controller;

import cn.hutool.core.bean.BeanUtil;
import com.huma.myreactback.Vo.ResponseVo;
import com.huma.myreactback.Vo.UserVo;
import com.huma.myreactback.domain.User;
import com.huma.myreactback.req.LoginInReq;
import com.huma.myreactback.service.UserService;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * @author hudenian
 * @date 2021/11/29
 */
@Slf4j
@RestController
@RequestMapping(value = "user", produces = MediaType.APPLICATION_JSON_VALUE)
public class UserController {

    @Resource
    private UserService userService;

    @PostMapping("login")
    @ApiOperation(value = "用户登录", notes = "用户登录")
    public ResponseVo<UserVo> login(@RequestBody @Valid LoginInReq loginInReq) {
        User user = userService.login(loginInReq.getUserName(),loginInReq.getPassword());
        return ResponseVo.createSuccess(BeanUtil.copyProperties(user,UserVo.class));

    }
}