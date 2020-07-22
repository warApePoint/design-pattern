package com.warape.designpattern.observer.frame.demo;

import com.warape.designpattern.observer.frame.Subscribe;
import com.warape.designpattern.observer.p2p.v2.service.NotificationService;
import com.warape.designpattern.observer.p2p.v2.service.impl.NotificationServiceImpl;

public class RegNotificationObserver {

    /**
     * 伪依赖注入
     */
    private final NotificationService notificationService = new NotificationServiceImpl();

    @Subscribe
    public void handleRegSuccess(Long userId) {
        notificationService.sendInboxMessage(userId, "欢迎适用本软件,欢迎欢迎,热烈欢迎");
    }
}
