package com.warape.designpattern.bridge.message;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<String> types = new ArrayList<>();
        types.add("zhangsan@xxx.com");
        MsgSender msgSender = new EmailMsgSender(types);
        Notification notification = new TrivialNotification(msgSender);
        notification.notify("发送邮件给XXX");

        types = new ArrayList<>();
        types.add("weixin123");
        msgSender = new WechatMsgSender(types);
        notification = new SevereNotification(msgSender);
        notification.notify("发送邮件给XXX");
    }
}
