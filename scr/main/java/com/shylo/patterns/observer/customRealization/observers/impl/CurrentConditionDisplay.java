package com.shylo.patterns.observer.customRealization.observers.impl;

import com.shylo.patterns.observer.DisplayElement;
import com.shylo.patterns.observer.customRealization.observers.Observer;
import com.shylo.patterns.observer.customRealization.subjects.Subject;

/**
 * Created by Igor on 10.04.2017.
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;


    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "°C degree and " + humidity + "% humidity");
    }
}
