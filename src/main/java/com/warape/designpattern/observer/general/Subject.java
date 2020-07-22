package com.warape.designpattern.observer.general;


public interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers(Message message);
}
