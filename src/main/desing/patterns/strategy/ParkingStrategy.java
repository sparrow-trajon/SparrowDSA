package main.desing.patterns.strategy;

public interface ParkingStrategy {

    public default  int getNormalPricePerHour(){
        return 10;
    }
}
