package com.shylo.patterns.observer.jdkRealization;

import com.shylo.patterns.observer.jdkRealization.observers.CurrentConditionDisplay;
import com.shylo.patterns.observer.jdkRealization.observers.ForecastDisplay;
import com.shylo.patterns.observer.jdkRealization.subjects.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        //Сначала создаём обьект WeatherData - Subject
        WeatherData weatherData = new WeatherData();

        //Дальше создаём обьект Observer и через конструктор регистрируем его
        CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
//        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        //имитация поступления новых погодных данных
        weatherData.setMeasurements(35, 65, 30.4f);
        weatherData.setMeasurements(26, 70, 28.6f);
        weatherData.setMeasurements(17, 90, 28.6f);

    }
}