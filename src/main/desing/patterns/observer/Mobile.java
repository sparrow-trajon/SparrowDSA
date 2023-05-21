package main.desing.patterns.observer;

public class Mobile implements  DisplayClient{
    WeatherStation weatherStation;

    public Mobile(WeatherStation weatherStation){
        this.weatherStation=weatherStation;
    }

    @Override
    public void update() {
        System.out.println(weatherStation.getTemprature());
    }
}
