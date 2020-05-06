package com.warape.designpattern.proxy;

public class Test {

    public static void main(String[] args) {
        UserControllerProxy userControllerProxy = new UserControllerProxy(new UserController(), new MetricsCollector());
        UserVo userVo = userControllerProxy.login("10010", "test");
        System.out.println(userVo);
    }
}
