package com.shylo.patterns.observer.jdkRealization.subjects;

import java.util.Observable;

/**
 * Реализация стандартной jdk структуры
 */
public class WeatherData extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        //Структура для хранения обсерверов не нужна(она есть в классе предке)
    }

    //Геттеры будут использоваться наблюдателями для получения состояния обьекта
    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void measurementsChanged() {
        //Специальный метод, который изменяет состояния флага и информирует о изменении субьекта
        setChanged();
        notifyObservers();
    }

    //Метод для имитации входных данных
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
