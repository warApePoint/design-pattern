package com.warape.designpattern.decorator.menu.permissons;

public class Homework implements Permission {
    @Override
    public String view() {
        return "作业";
    }
}