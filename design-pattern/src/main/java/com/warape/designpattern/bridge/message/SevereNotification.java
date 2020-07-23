package com.warape.designpattern.bridge.message;

public class SevereNotification extends Notification {

    public SevereNotification(MsgSender msgSender) {
        super(msgSender);
    }

    @Override
    public void notify(String message) {
        //加急逻辑
        msgSender.send("【严重】"+message);
    }
}
