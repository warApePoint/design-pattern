package com.warape.designpattern.observer.p2p.v2.service.impl;

import cn.hutool.core.util.RandomUtil;
import cn.hutool.core.util.StrUtil;
import com.warape.designpattern.observer.p2p.v2.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public long register(String telephone, String password) {
        System.out.println(StrUtil.format("注册用户电话:{} 号码:{}",telephone,password));
        return RandomUtil.randomInt(0,100);
    }
}
