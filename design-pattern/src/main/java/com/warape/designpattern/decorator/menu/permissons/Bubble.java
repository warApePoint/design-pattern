package com.warape.designpattern.decorator.menu.permissons;

public class Bubble implements Permission {
    @Override
    public String view() {
        return "冒泡";
    }
}