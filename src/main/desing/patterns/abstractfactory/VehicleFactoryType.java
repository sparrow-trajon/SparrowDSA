package main.desing.patterns.abstractfactory;

public class VehicleFactoryType {

    public static VehicleFactory getVehicleFactory(String type){

        if (type.equalsIgnoreCase("ordinary")){
            return  new OrdinaryVehicleFactory();
        }
        else{
            return  new LuxryVehicleFactory();
        }

    }
}
