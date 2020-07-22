package com.warape.designpattern.proxy.staticproxy;

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
        UserVo userVo = userController.login(telephone, password);
        metricsCollector.recordRequest(new RequestInfo<>("login", System.currentTimeMillis() - startTime, userVo));
        return userVo;
    }

    @Override
    public UserVo register(String telephone, String password) {
        long startTime = System.currentTimeMillis();
        UserVo userVo = userController.register(telephone, password);
        metricsCollector.recordRequest(new RequestInfo<>("register", System.currentTimeMillis() - startTime, userVo));
        return userVo;
    }
}
