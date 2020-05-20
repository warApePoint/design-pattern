package com.warape.designpattern.decorator.menu.permissons;

public class Problem implements Permission {
    @Override
    public String view() {
        return "题库";
    }
}