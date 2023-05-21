package main.solids.liskov;

public class Bicycle implements  Bike{

    static int speed=0;

    @Override
    public void turnOnEngine() {
        System.out.println("There is no engine in the bicycle");
    }

    @Override
    public int accrelate() {
        return speed+=5;
    }

}
