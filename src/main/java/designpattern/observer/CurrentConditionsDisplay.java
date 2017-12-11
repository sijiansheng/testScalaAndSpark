package designpattern.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by sijiansheng on 2016/9/9.
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    Observable observable;
    private float temperature;
    private float humidity;

    @Override
    public void update(Observable o, Object arg) {

        if (o instanceof WeatherData) {
            this.observable = observable;
            observable.addObserver(this);
        }

    }

    public void setObservable(Observable observable) {
        this.observable = observable;
    }

    @Override
    public void display() {
        System.out.println("current codutions:" + temperature + "humidity:" + humidity);
    }
}
