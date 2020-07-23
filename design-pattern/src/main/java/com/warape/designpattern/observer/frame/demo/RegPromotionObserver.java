package com.warape.designpattern.observer.frame.demo;

import com.warape.designpattern.observer.frame.Subscribe;
import com.warape.designpattern.observer.p2p.v2.service.PromotionService;
import com.warape.designpattern.observer.p2p.v2.service.impl.PromotionServiceImpl;

public class RegPromotionObserver {

    /**
     * 伪依赖注入
     */
    private final PromotionService promotionService = new PromotionServiceImpl();

    @Subscribe
    public void handleRegSuccess(Long userId) {

        promotionService.issueNewUserExperienceCash(userId);
    }
}
