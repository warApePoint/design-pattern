package com.warape.designpattern.bridge.message;

public class UrgencyNotification extends Notification {

    public UrgencyNotification(MsgSender msgSender) {
        super(msgSender);
    }

    @Override
    public void notify(String message) {
        msgSender.send("【紧急的】"+message);
    }
}
