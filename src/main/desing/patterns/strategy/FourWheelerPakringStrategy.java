package main.desing.patterns.strategy;

public class FourWheelerPakringStrategy implements  ParkingStrategy{

    @Override
    public int getNormalPricePerHour() {
        return 20;
    }

}
