package com.warape.designpattern.observer.p2p.v2.controller;

import com.google.common.eventbus.AsyncEventBus;
import com.google.common.eventbus.EventBus;
import com.warape.designpattern.observer.p2p.v1.RegObserver;
import com.warape.designpattern.observer.p2p.v2.RegNotificationObserver;
import com.warape.designpattern.observer.p2p.v2.RegPromotionObserver;
import com.warape.designpattern.observer.p2p.v2.service.UserService;
import com.warape.designpattern.observer.p2p.v2.service.impl.UserServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;

/**
 * @author wan
 */
public class UserController {

    private static final int DEFAULT_EVENTBUS_THREAD_POOL_SIZE = 20;

    private static final EventBus EVENT_BUS = new AsyncEventBus(Executors.newFixedThreadPool(DEFAULT_EVENTBUS_THREAD_POOL_SIZE));

    /**
     * 配置化
     */
    private static final List<RegObserver> REG_OBSERVER_LIST = new ArrayList<>();

    static {
        EVENT_BUS.register(new RegNotificationObserver());
        EVENT_BUS.register(new RegPromotionObserver());
    }

    /**
     * 伪依赖注入
     */
    private final UserService userService = new UserServiceImpl();


    public Long register(String telephone, String password) {
        //省略输入参数的校验代码 //省略userService.register()异常的try-catch代码
        long userId = userService.register(telephone, password);
        EVENT_BUS.post(userId);
        return userId;
    }

    public static void main(String[] args) throws Exception {
        UserController userController = new UserController();
        userController.register("13222222222", "warape");
    }
}
