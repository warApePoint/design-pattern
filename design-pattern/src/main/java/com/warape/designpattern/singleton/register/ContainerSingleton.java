package com.warape.designpattern.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author wan
 */
public class ContainerSingleton {

    private ContainerSingleton() {
    }

    private static Map<String, Object> ioc = new ConcurrentHashMap<String, Object>();

    public static Object getInstance(Class<?> classz) {
        Object instance = null;
        String className = classz.getName();
        if (!ioc.containsKey(className)) {
            synchronized (ContainerSingleton.class) {
                if (!ioc.containsKey(className)) {
                    try {
                        instance = Class.forName(className).newInstance();
                        ioc.put(className, instance);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    return instance;
                }
            }
        }
        return ioc.get(className);
    }

}
