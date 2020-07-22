package com.warape.designpattern.observer.frame;

import cn.hutool.json.JSONUtil;
import com.google.common.base.Preconditions;

import java.lang.reflect.Method;
import java.lang.reflect.TypeVariable;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * @author wan
 */
public class ObserverRegistry {

    /**
     * key 参数类型 value 方法列表
     */
    private ConcurrentMap<Class<?>, CopyOnWriteArraySet<ObserverAction>> registry = new ConcurrentHashMap<>();

    public void register(Object object) {

        Class<?> clazz = object.getClass();

        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            // 判断是否包含注解
            if (!method.isAnnotationPresent(Subscribe.class)) {
                continue;
            }
            Class<?>[] parameterTypes = method.getParameterTypes();
            Class<?> parameterType = parameterTypes[0];

            if (!registry.containsKey(parameterType)) {
                registry.put(parameterType, new CopyOnWriteArraySet<>());
            }
            registry.get(parameterType).add(new ObserverAction(object, method));
        }

    }

    public ConcurrentMap<Class<?>, CopyOnWriteArraySet<ObserverAction>> getRegistry() {
        return registry;
    }

}
