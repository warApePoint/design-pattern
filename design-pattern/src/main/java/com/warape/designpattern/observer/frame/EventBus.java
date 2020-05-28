package com.warape.designpattern.observer.frame;

import com.google.common.util.concurrent.MoreExecutors;

import java.lang.reflect.Method;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;

/**
 * @author wan
 */
public class EventBus {

    private final ObserverRegistry observerRegistry = new ObserverRegistry();

    public void post(Object o) {
        observerRegistry.getRegistry().get(o.getClass()).forEach(observerAction -> observerAction.execute(o));
    }

    public void register(Object object) {

        observerRegistry.register(object);
    }
}
