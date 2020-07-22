package com.warape.designpattern.observer.p2p.v1;

import com.warape.designpattern.observer.p2p.v1.service.PromotionService;
import com.warape.designpattern.observer.p2p.v1.service.impl.PromotionServiceImpl;

public class RegPromotionObserver implements RegObserver {

    /**
     * 伪依赖注入
     */
    private final PromotionService promotionService = new PromotionServiceImpl();

    @Override
    public void handleRegSuccess(long userId) {
        promotionService.issueNewUserExperienceCash(userId);
    }
}
