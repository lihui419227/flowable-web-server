package org.flowable.webserver.modules.login.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.flowable.engine.RuntimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: create by lisl
 * @version: v1.0
 * @description:
 * @date:2018/11/9
 */
@Api(value = "身份管理",description = "身份管理")
@RestController
@RequestMapping(value = "/identity")
public class LoginController {
    @Autowired
    private RuntimeService runtimeService;

    @ApiOperation(value = "登陆")
    @RequestMapping(value = "/login")
    public void login() throws Exception {
        System.out.println("login sucess!");
        System.out.println(runtimeService);
    }
}
