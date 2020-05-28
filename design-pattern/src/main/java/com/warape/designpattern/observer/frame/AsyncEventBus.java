package com.warape.designpattern.observer.frame;

import java.util.concurrent.Executor;

/**
 * @author wan
 */
public class AsyncEventBus extends EventBus {


    public AsyncEventBus(Executor executor) {
        super(executor);
    }

}
