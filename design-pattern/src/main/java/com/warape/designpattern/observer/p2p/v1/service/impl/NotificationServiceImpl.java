package com.warape.designpattern.observer.p2p.v1.service.impl;

import cn.hutool.core.util.StrUtil;
import com.warape.designpattern.observer.p2p.v1.service.NotificationService;

public class NotificationServiceImpl implements NotificationService {
    @Override
    public void sendInboxMessage(long userId, String message) {
        System.out.println(StrUtil.format("用户:{} message:{}",userId,message));
    }
}
