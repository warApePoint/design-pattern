package com.warape.designpattern.observer.frame;

import java.util.concurrent.Executor;

/**
 * @author wan
 */
public class AsyncEventBus extends EventBus {

    private final Executor executor;

    public AsyncEventBus(Executor executor) {
        this.executor = executor;
    }

    @Override
    public void post(Object o) {
        executor.execute(() -> {
            super.post(o);
        });
    }
}
