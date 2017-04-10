package com.shylo.patterns.observer.customRealization.subjects;

import com.shylo.patterns.observer.customRealization.observers.Observer;

/**
 * Интерфейс субьекта, который администрирует наблюдателей
 */
public interface Subject {

    public void registerObserver(Observer o);

    public void removeObserver(Observer o);

    public void notifyObservers();

}
