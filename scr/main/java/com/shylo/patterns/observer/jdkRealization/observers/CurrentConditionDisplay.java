package com.shylo.patterns.observer.jdkRealization.observers;

import com.shylo.patterns.observer.DisplayElement;
import com.shylo.patterns.observer.jdkRealization.subjects.WeatherData;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Igor on 10.04.2017.
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {
    Observable observable;
    private float temperature;
    private float humidity;


    public CurrentConditionDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }



    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "°C degree and " + humidity + "% humidity");
    }
}
