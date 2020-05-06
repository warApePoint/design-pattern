package com.warape.designpattern.proxy;

import cn.hutool.core.util.StrUtil;

public class MetricsCollector {

    public void recordRequest(RequestInfo requestInfo) {
        System.out.println(StrUtil.format("接口名称:{} 处理时长: {}",requestInfo.getName(),requestInfo.getTime()));
    }
}
