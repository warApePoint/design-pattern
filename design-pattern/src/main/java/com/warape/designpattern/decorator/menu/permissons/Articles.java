package com.warape.designpattern.decorator.menu.permissons;

public class Articles implements Permission {
    @Override
    public String view() {
        return "文章";
    }
}