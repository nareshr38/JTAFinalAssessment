package com.jtafinalassessment.code.question3;

public class MotorCycle extends Vehicle {
    public MotorCycle(){
        spotsNeeded = 1;
        size = VehicleSize.Motorcycle;
    }

    @Override
    public boolean canFitInSpot(ParkingSpot spot) {
        return spot.getSizeOfVehicle() == VehicleSize.Motorcycle || spot.getSizeOfVehicle() == VehicleSize.CarSize || spot.getSizeOfVehicle() == VehicleSize.Large;
    }

}
