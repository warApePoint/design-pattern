package com.warape.designpattern.proxy;

public class UserControllerProxy implements IUserController {

    private UserController userController;
    private MetricsCollector metricsCollector;

    public UserControllerProxy(UserController userController,MetricsCollector metricsCollector) {
        this.userController = userController;
        this.metricsCollector = metricsCollector;
    }

    @Override
    public UserVo login(String telephone, String password) {
        long startTime = System.currentTimeMillis();
        UserVo login = userController.login(telephone, password);
        metricsCollector.recordRequest(new RequestInfo("login",System.currentTimeMillis()-startTime));
        return login;
    }

    @Override
    public UserVo register(String telephone, String password) {
        long startTime = System.currentTimeMillis();
        UserVo userVo = userController.register(telephone, password);
        metricsCollector.recordRequest(new RequestInfo("register",System.currentTimeMillis()-startTime));
        return userVo;
    }
}
