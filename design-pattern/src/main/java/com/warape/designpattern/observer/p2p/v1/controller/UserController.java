package com.warape.designpattern.observer.p2p.v1.controller;

import com.warape.designpattern.observer.p2p.v1.RegNotificationObserver;
import com.warape.designpattern.observer.p2p.v1.RegObserver;
import com.warape.designpattern.observer.p2p.v1.RegPromotionObserver;
import com.warape.designpattern.observer.p2p.v1.service.UserService;
import com.warape.designpattern.observer.p2p.v1.service.impl.UserServiceImpl;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wan
 */
public class UserController {

    /**
     * 伪依赖注入
     */
    private final UserService userService = new UserServiceImpl();

    /**
     * 配置化
     */
    private static final List<RegObserver> REG_OBSERVER_LIST = new ArrayList<>();

    static {
        // 伪容器初始化
        REG_OBSERVER_LIST.add(new RegNotificationObserver());
        REG_OBSERVER_LIST.add(new RegPromotionObserver());
    }


    public Long register(String telephone, String password) {
        //省略输入参数的校验代码 //省略userService.register()异常的try-catch代码
        long userId = userService.register(telephone, password);

        REG_OBSERVER_LIST.forEach(regObserver -> regObserver.handleRegSuccess(userId));
        return userId;
    }

    public static void main(String[] args) {
        UserController userController = new UserController();
        userController.register("13222222222", "warape");
    }
}
