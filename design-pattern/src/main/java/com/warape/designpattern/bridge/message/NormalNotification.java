package com.warape.designpattern.bridge.message;

public class NormalNotification extends Notification {

    public NormalNotification(MsgSender msgSender) {
        super(msgSender);
    }

    @Override
    public void notify(String message) {
        msgSender.send("【正常的】"+message);
    }
}
