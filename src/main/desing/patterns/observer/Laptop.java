package main.desing.patterns.observer;

public class Laptop implements  DisplayClient{

    WeatherStation weatherStation;

    public Laptop(WeatherStation weatherStation){
        this.weatherStation=weatherStation;
    }

    @Override
    public void update() {
        System.out.println(weatherStation.getTemprature());
    }
}
