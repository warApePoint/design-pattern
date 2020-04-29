package com.warape.designpattern.singleton.lazy;

/**
 * @author wan
 */
public class LazyStaticInnerClassSingleton {

    private LazyStaticInnerClassSingleton(){
        throw new RuntimeException("不允许非法访问");
    }

    private static LazyStaticInnerClassSingleton getInstance(){
        return LazyHolder.INSTANCE;
    }

    private static class LazyHolder{
        private static final LazyStaticInnerClassSingleton INSTANCE = new LazyStaticInnerClassSingleton();
    }

}
