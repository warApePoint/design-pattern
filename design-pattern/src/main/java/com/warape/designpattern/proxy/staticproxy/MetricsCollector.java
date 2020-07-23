package com.warape.designpattern.proxy.staticproxy;

import cn.hutool.core.util.StrUtil;
import cn.hutool.json.JSONUtil;

/**
 * @author wan
 */
public class MetricsCollector {

    public void recordRequest(RequestInfo<?> requestInfo) {
        String format = StrUtil.format("接口名称:{} 处理时长: {} 返回结果:{} ", requestInfo.getName(), requestInfo.getTime(), JSONUtil.toJsonStr(requestInfo.getResult()));
        System.out.println(format);
    }
}
