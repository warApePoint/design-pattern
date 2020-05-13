package com.warape.designpattern.bridge.message;

import java.util.List;

public class TelephoneMsgSender implements MsgSender {

    private List<String> telephones;

    public TelephoneMsgSender(List<String> telephones) {
        this.telephones = telephones;
    }

    @Override
    public void send(String message) {
        System.out.println("电话通知:" + message + " 被发送人:" + telephones);
    }
}
