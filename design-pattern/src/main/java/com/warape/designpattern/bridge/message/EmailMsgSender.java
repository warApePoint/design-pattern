package com.warape.designpattern.bridge.message;

import java.util.List;

public class EmailMsgSender implements MsgSender {

    private List<String> emails;

    public EmailMsgSender(List<String> emails) {
        this.emails = emails;
    }

    @Override
    public void send(String message) {
        System.out.println("邮件通知:" + message + " 被发送人:" + emails);
    }
}
