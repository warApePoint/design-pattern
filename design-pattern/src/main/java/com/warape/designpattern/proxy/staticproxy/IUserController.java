package com.warape.designpattern.proxy.staticproxy;

public interface IUserController {

    UserVo login(String telephone, String password);
    UserVo register(String telephone, String password);
}
