package com.shylo.patterns.observer.customRealization.observers;

/**
 * Created by Igor on 10.04.2017.
 */
public interface Observer {

    void update(float temperature, float humidity, float pressure);
}
