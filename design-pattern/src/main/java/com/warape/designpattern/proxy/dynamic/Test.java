package com.warape.designpattern.proxy.dynamic;

import com.warape.designpattern.proxy.staticproxy.IUserController;
import com.warape.designpattern.proxy.staticproxy.UserController;
import com.warape.designpattern.proxy.staticproxy.UserVo;

public class Test {

    public static void main(String[] args) {
        MetricsCollectorProxy metricsCollectorProxy = new MetricsCollectorProxy();
        IUserController userController = (IUserController) metricsCollectorProxy.createProxy(new UserController());
        UserVo userVo = userController.login("10010", "test");

    }
}
