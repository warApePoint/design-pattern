package com.warape.designpattern.singleton.serializable;

import java.io.Serializable;

/**
 * @author wan
 */
public class SeriableSingleton implements Serializable {

    public  final static SeriableSingleton INSTANCE = new SeriableSingleton();
    private SeriableSingleton(){}

    public static SeriableSingleton getInstance(){
        return INSTANCE;
    }

    private Object readResolve(){ return INSTANCE;}

}
