package com.warape.designpattern.decorator.menu.permissons;

public class Boutique implements Permission {
    @Override
    public String view() {
        return "精品课";
    }
}