package com.warape.designpattern.proxy;

public class UserController implements IUserController {
    @Override
    public UserVo login(String telephone, String password) {
        System.out.println("UserController 登录");
        return new UserVo(1L,"login");
    }

    @Override
    public UserVo register(String telephone, String password) {
        System.out.println("UserController 注册");
        return new UserVo(2L,"register");
    }
}
