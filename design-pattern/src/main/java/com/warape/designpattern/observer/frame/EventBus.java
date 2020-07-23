package com.warape.designpattern.observer.frame;

import com.google.common.util.concurrent.MoreExecutors;

import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;

/**
 * @author wan
 */
public class EventBus {

    private final ObserverRegistry observerRegistry = new ObserverRegistry();

    private final Executor executor;

    public EventBus() {
        this(MoreExecutors.directExecutor());
    }

    protected EventBus(Executor executor) {
        this.executor = executor;
    }

    public void post(Object o) {
        CopyOnWriteArraySet<ObserverAction> observerActions = observerRegistry.getRegistry().get(o.getClass());
        observerActions.forEach(observerAction -> executor.execute(() -> observerAction.execute(o)));
    }

    public void register(Object object) {

        observerRegistry.register(object);
    }
}
