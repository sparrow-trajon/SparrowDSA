package main.desing.patterns.strategy;

public class SixWheelerStrategy implements  ParkingStrategy{

    @Override
    public int getNormalPricePerHour() {
        return 30;
    }
}
