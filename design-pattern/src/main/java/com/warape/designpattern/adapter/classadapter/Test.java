package com.warape.designpattern.adapter.classadapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test {

    private static final Logger log = LoggerFactory.getLogger(Test.class);

    public static void main(String[] args) {
        log.info("充电转换");
        DC5 adapter = new PowerAdapter();
        adapter.output5V();

    }
}
