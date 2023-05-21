package main.desing.patterns.strategy;

public class TwoWheelerParkingStrategy implements  ParkingStrategy {

    @Override
    public int getNormalPricePerHour() {
        return ParkingStrategy.super.getNormalPricePerHour();
    }
}
