package com.jtafinalassessment.code.question3;

public class Bus extends Vehicle {

    public Bus(){
        spotsNeeded = 5;
        size = VehicleSize.Large;

    }

    @Override
    public boolean canFitInSpot(ParkingSpot spot) {
        return spot.getSizeOfVehicle() == VehicleSize.Large;
    }

}
