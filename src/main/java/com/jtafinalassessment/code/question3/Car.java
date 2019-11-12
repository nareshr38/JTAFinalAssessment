package com.jtafinalassessment.code.question3;

public class Car extends Vehicle {
    public Car(){
        spotsNeeded = 1;
        size = VehicleSize.CARSIZE;
    }

    public boolean canFitInSpot(ParkingSpot spot){
        return spot.getSizeOfVehicle() == VehicleSize.CARSIZE || spot.getSizeOfVehicle() == VehicleSize.LARGE;
    }

}
