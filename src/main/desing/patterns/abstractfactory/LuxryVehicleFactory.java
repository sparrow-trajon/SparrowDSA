package main.desing.patterns.abstractfactory;

public class LuxryVehicleFactory implements  VehicleFactory{

    @Override
    public Vehicle getVehicle() {
        return new BMW();
    }
}
