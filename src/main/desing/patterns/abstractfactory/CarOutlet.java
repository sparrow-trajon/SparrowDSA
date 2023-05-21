package main.desing.patterns.abstractfactory;

public class CarOutlet {

    public static void main(String[] args) {

        String vehicleType="luxory";

        int cost=VehicleFactoryType.getVehicleFactory(vehicleType).getVehicle().getCost();
        System.out.println("vehicle cost >>"+ cost);
    }
}
