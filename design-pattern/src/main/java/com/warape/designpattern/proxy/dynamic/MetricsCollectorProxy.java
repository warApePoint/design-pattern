package com.warape.designpattern.proxy.dynamic;


import com.warape.designpattern.proxy.staticproxy.MetricsCollector;
import com.warape.designpattern.proxy.staticproxy.RequestInfo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MetricsCollectorProxy {

    private MetricsCollector metricsCollector;

    public MetricsCollectorProxy() {
        this.metricsCollector = new MetricsCollector();
    }

    /**
     * 创建代理
     *
     * @param proxiedObject 被代理对象
     * @return
     */
    public Object createProxy(Object proxiedObject) {
        Class<?>[] interfaces = proxiedObject.getClass().getInterfaces();
        DynamicProxyHandler handler = new DynamicProxyHandler(proxiedObject);
        return Proxy.newProxyInstance(proxiedObject.getClass().getClassLoader(), interfaces, handler);
    }

    private class DynamicProxyHandler implements InvocationHandler {

        private Object proxiedObject;

        public DynamicProxyHandler(Object proxiedObject) {
            this.proxiedObject = proxiedObject;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            long startTimestamp = System.currentTimeMillis();
            String apiName = proxiedObject.getClass().getName() + ":" + method.getName();
            Object result = method.invoke(proxiedObject, args);
            metricsCollector.recordRequest(new RequestInfo<>(apiName, System.currentTimeMillis() - startTimestamp, result));
            return result;
        }
    }

}
