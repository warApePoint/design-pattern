package com.warape.designpattern.bridge.message;

public class TrivialNotification extends Notification {

    public TrivialNotification(MsgSender msgSender) {
        super(msgSender);
    }

    @Override
    public void notify(String message) {
        msgSender.send("【不重要的】"+message);
    }
}
