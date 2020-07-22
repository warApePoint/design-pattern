package com.warape.designpattern.decorator.menu.permissons;

public class Shop implements Permission {
    @Override
    public String view() {
        return "商城";
    }
}