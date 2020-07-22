package com.warape.designpattern.chain.build;

import com.warape.designpattern.chain.Member;

public class LoginHandler extends AbstractHandler {
    @Override
    public void doHandler(Member member) {
        System.out.println("登录成功！");
        member.setRoleName("管理员");
        if(null != next) {
            next.doHandler(member);
        }
    }
}