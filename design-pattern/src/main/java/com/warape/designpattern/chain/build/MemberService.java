package com.warape.designpattern.chain.build;

import com.warape.designpattern.chain.Member;

public class MemberService {

    public void login(String loginName,String loginPass){

        Handler<?> handler = Handler.builder().addHandler(new ValidateHandler())
                .addHandler(new LoginHandler())
                .addHandler(new AuthHandler())
                .build();

        handler.doHandler(new Member(loginName, loginPass));
    }

}