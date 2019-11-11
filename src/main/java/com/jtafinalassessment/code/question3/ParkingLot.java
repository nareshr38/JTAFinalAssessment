package com.jtafinalassessment.code.question3;

public class ParkingLot {
    private Level[] levels;
    private final int numberOfLevels = 2;

    public ParkingLot() {
        levels = new Level[numberOfLevels];
        for (int count = 0; count < numberOfLevels; count++) {
            levels[count] = new Level(count, 20);
        }
    }

    public boolean parkVehicle(Vehicle vehicle) {
        for (int count = 0; count < levels.length; count++) {
            if (levels[count].parkVehicle(vehicle)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int count = 0; count < numberOfLevels; count++) {
            sb.append("Level " + count + ": " + levels[count] + "\n");
        }
        return sb.toString();
    }

}