package com.warape.designpattern.singleton.hungry;

/**
 * 优点：执行效率高，性能高，没有任何的锁
 * 缺点：某些情况下，可能会造成内存浪费
 * @author wan
 */
public class HungrySingleton {

    private static final HungrySingleton HUNGRY_SINGLETON = new HungrySingleton();

    private HungrySingleton(){}

    public static HungrySingleton getInstance(){
        return  HUNGRY_SINGLETON;
    }
}
