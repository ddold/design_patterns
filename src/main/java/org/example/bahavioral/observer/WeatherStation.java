package org.example.bahavioral.observer;

import org.example.bahavioral.observer.observer.CurrentConditionsDisplay;
import org.example.bahavioral.observer.observer.ForecastDisplay;
import org.example.bahavioral.observer.observer.HeatIndexDisplay;
import org.example.bahavioral.observer.observer.StatisticsDisplay;
import org.example.bahavioral.observer.subject.WeatherData;

/*
https://refactoring.guru/design-patterns/observer
 */
public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
