package com.raphael.inner;

import com.raphael.pkg.CurrentConditionsDisplay;
import com.raphael.pkg.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Nov on 2015/1/14.
 */
public class CurrentConditionDisplay implements Observer,DisplayElement {
    Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionDisplay(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }

    public void update(Observable obs,Object arg){
        if(obs instanceof WeatherData)
        {
            WeatherData weatherData = (WeatherData)obs;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }


    public void display(){
        System.out.println("current conditions:"+temperature+"F degrees and "+ humidity+"% humidity");
    }


}

