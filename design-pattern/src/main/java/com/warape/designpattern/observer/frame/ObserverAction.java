package com.warape.designpattern.observer.frame;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


/**
 * @author wan
 */
@EqualsAndHashCode
@Data
public class ObserverAction {

    private Object target;
    private Method method;

    public ObserverAction(Object target, Method method) {
        this.target = target;
        this.method = method;
        this.method.setAccessible(true);
    }

    public void execute(Object event) {
        try {
            method.invoke(target, event);
        } catch (InvocationTargetException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
