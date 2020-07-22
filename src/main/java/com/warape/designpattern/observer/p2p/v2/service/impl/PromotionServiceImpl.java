package com.warape.designpattern.observer.p2p.v2.service.impl;

import cn.hutool.core.util.StrUtil;
import com.warape.designpattern.observer.p2p.v2.service.PromotionService;

public class PromotionServiceImpl implements PromotionService {
    @Override
    public void issueNewUserExperienceCash(long userId) {
        System.out.println(StrUtil.format("给用户:{} 发放体验金",userId));
    }
}
