package com.shylo.patterns.observer.jdkRealization.observers;

import com.shylo.patterns.observer.DisplayElement;
import com.shylo.patterns.observer.jdkRealization.subjects.WeatherData;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Igor on 10.04.2017.
 */
public class ForecastDisplay implements Observer, DisplayElement {
    private float currentPressure = 29.92f;
    private float lastPressure;

    public ForecastDisplay(Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.lastPressure = currentPressure;
            this.currentPressure = weatherData.getPressure();
            display();
        }
    }

    @Override
    public void display() {
        if (currentPressure > lastPressure) {
            System.out.println("Forecast: Improving weather on the way");
        } else if (currentPressure == lastPressure) {
            System.out.println("Forecast: More of the same");
        } else {
            System.out.println("Forecast: Watch out for cooler, rainy weather");
        }

    }
}
