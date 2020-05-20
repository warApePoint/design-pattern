package com.warape.designpattern.decorator.menu.permissons;

public class QA implements Permission {
    @Override
    public String view() {
        return "问答";
    }
}