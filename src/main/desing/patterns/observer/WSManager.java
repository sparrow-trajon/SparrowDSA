package main.desing.patterns.observer;

public class WSManager {

    public static WeatherStation weatherStation= new WeatherStation();

    public static void main(String[] args) {
        weatherStation.addDisplayClient(new Laptop(weatherStation));
            weatherStation.addDisplayClient(new Mobile( weatherStation));

        weatherStation.updateTemprature(10);

    }
}
