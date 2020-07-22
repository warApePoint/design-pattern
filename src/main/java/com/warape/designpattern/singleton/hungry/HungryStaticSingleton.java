package com.warape.designpattern.singleton.hungry;

/**
 * @author wan
 */
public class HungryStaticSingleton {

    private static final HungryStaticSingleton HUNGRY_SINGLETON;

    static {
        HUNGRY_SINGLETON = new HungryStaticSingleton();
    }

    private HungryStaticSingleton(){}

    public static HungryStaticSingleton getInstance(){
        return  HUNGRY_SINGLETON;
    }
}
