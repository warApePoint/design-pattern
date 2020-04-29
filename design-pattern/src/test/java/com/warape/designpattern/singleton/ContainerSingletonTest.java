package com.warape.designpattern.singleton;


import com.warape.designpattern.singleton.register.ContainerSingleton;

/**
 *
 */
public class ContainerSingletonTest {
    public static void main(String[] args) {
        Object instance1 = ContainerSingleton.getInstance(Pojo.class);
        Object instance2 = ContainerSingleton.getInstance(Pojo.class);
        System.out.println(instance1 == instance2);
    }
}
