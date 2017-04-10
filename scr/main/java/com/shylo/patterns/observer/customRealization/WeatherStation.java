package com.shylo.patterns.observer.customRealization;

import com.shylo.patterns.observer.customRealization.observers.impl.CurrentConditionDisplay;
import com.shylo.patterns.observer.customRealization.observers.impl.HeatIndexDisplay;
import com.shylo.patterns.observer.customRealization.subjects.impl.WeatherData;

/**
 * Created by Igor on 10.04.2017.
 */
public class WeatherStation {
    public static void main(String[] args) {
        //Сначала создаём обьект WeatherData - Subject
        WeatherData weatherData = new WeatherData();

        //Дальше создаём обьект Observer и через конструктор регистрируем его
        CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        //имитация поступления новых погодных данных
        weatherData.setMeasurements(35, 65, 30.4f);
        weatherData.setMeasurements(26, 70, 28.6f);
        weatherData.setMeasurements(17, 90, 27.2f);

    }
}
