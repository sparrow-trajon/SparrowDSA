package main.desing.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation {

    private static int temprature;
    private static List<DisplayClient> displays = new ArrayList<>();

    public  void addDisplayClient(DisplayClient displayClient) {
        displays.add(displayClient);
    }
    public  void removeDisplayClient(DisplayClient displayClient) {
        displays.remove(displayClient);
    }
    public  void notifyDisplay() {
        displays.stream().forEach(x -> x.update());
    }
    public void updateTemprature(int newTemp) {
        temprature = newTemp;
        notifyDisplay();
    }


    public  int getTemprature() {
        return temprature;
    }



}
