package com.warape.designpattern.decorator.base;

import java.io.*;

public class Test {

    public static void main(String[] args) throws IOException {
        ConcreteComponent concreteComponent = new ConcreteComponent();
        ConcreteDecorator concreteDecorator = new ConcreteDecorator(concreteComponent);
        concreteDecorator.operation();
    }
}
