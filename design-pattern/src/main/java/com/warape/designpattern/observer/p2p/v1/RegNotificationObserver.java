package com.warape.designpattern.observer.p2p.v1;

import com.warape.designpattern.observer.p2p.v1.service.NotificationService;
import com.warape.designpattern.observer.p2p.v1.service.impl.NotificationServiceImpl;

public class RegNotificationObserver implements RegObserver {

    /**
     * 伪依赖注入
     */
    private final NotificationService notificationService = new NotificationServiceImpl();

    @Override
    public void handleRegSuccess(long userId) {
        notificationService.sendInboxMessage(userId,"欢迎适用本软件,欢迎欢迎,热烈欢迎");
    }
}
