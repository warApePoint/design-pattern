package com.warape.designpattern.decorator.menu.permissons;

public class SystemSet implements Permission {
    @Override
    public String view() {
        return "系统设置";
    }
}