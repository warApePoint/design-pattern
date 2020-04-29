package com.warape.designpattern.singleton.register;

/**
 * @author wan
 */

public enum EnumSingleton {
    /**
     * 实例
     */
    INSTANCE;

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSingleton getInstance(){return INSTANCE;}
}
