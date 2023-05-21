package main.desing.patterns.abstractfactory;

public class OrdinaryVehicleFactory implements  VehicleFactory{

    @Override
    public Vehicle getVehicle() {
        return new WagonR();
    }
}
