package main.desing.patterns.strategy;

/**
 * PakringInvoice have Parking strategy instead of having the parking fee hardcoded for all the vehicles
 * ParkingStrategy will have dynamic calculation of calculating the price on the basis of object of the vehicle.
 *
 */
public class ParkingInvoice {

    ParkingStrategy parkingStrategy;
    int durationInHour;


    public  ParkingInvoice(ParkingStrategy parkingStrategy){
        this.parkingStrategy=parkingStrategy;
    }

    public float calculatePrice(){

        return durationInHour* parkingStrategy.getNormalPricePerHour();

    }
}
