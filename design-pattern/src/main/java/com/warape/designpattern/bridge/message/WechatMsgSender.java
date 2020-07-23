package com.warape.designpattern.bridge.message;

import java.util.List;

public class WechatMsgSender implements MsgSender {

    private List<String> webchats;

    public WechatMsgSender(List<String> webchats) {
        this.webchats = webchats;
    }

    @Override
    public void send(String message) {
        System.out.println("微信通知:" + message + " 被发送人:" + webchats);
    }
}
