package com.warape.designpattern.proxy.staticproxy;

public class Test {

    public static void main(String[] args) {
        UserControllerProxy userControllerProxy = new UserControllerProxy(new UserController(), new MetricsCollector());
        UserVo userVo = userControllerProxy.login("10010", "test");
    }
}
