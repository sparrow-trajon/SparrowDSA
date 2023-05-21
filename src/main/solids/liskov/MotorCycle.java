package main.solids.liskov;

public class MotorCycle implements  Bike{
    static int speed=0;
    static  boolean isEngineOn=false;

    @Override
    public int accrelate() {
        return speed+=10;
    }

    @Override
    public void turnOnEngine() {

        isEngineOn=true;
    }

}
