package com.warape.designpattern.decorator.menu.permissons;

public class Growth implements Permission {
    @Override
    public String view() {
        return "成长墙";
    }
}