package com.warape.designpattern.chain.build;

import com.warape.designpattern.chain.Member;

public class MemberService {

    public void login(String loginName,String loginPass){

        AbstractHandler handler = AbstractHandler.builder()
                .addHandler(new ValidateHandler())
                .addHandler(new LoginHandler())
                .addHandler(new AuthHandler())
//                .addHandler(new AuthHandler1())
                .build();

        handler.doHandler(new Member(loginName, loginPass));
    }

}