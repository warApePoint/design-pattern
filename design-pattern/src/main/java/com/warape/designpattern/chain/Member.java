package com.warape.designpattern.chain;

import lombok.Data;

@Data
public class Member {

    public Member(String loginName, String loginPass) {
        this.loginName = loginName;
        this.loginPass = loginPass;
    }

    private String loginName;
    private String loginPass;
    private String roleName;
}
