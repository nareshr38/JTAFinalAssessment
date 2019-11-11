package com.jtafinalassessment.code.question3;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class ParkingUtility {
    private static final Logger LOGGER = LogManager.getLogger(ParkingUtility.class.getName());
    public static void main(String[] args) {

        ParkingLot parkingLot = new ParkingLot();
        String inputData = "";
        Scanner input = new Scanner(System.in);

        LOGGER.info("The empty parking lot\n");
        LOGGER.info(parkingLot.toString());

        LOGGER.info("Please enter bus, car, or motorcycle a vehicle (enter 0 to exit): ");
        inputData = input.next();

        while (!inputData.equals("0")) {
            if (inputData.equals("Bus") || inputData.equals("bus")) {
                Bus bus = new Bus();

                if (parkingLot.parkVehicle(bus)) {

                    LOGGER.info("\nThe bus has been parked successfully.");
                    LOGGER.info(parkingLot.toString());
                    LOGGER.info("Please enter bus, car, or motorcycle to park a vehicle (enter 0 to exit): ");
                    inputData = input.next();
                } else {
                    LOGGER.info("\nParking Failed: Bus spots are full");
                    LOGGER.info("Please enter car or motorcycle to park a vehicle (enter 0 to exit): ");
                    inputData = input.next();
                }
            } else if (inputData.equals("Car") || inputData.equals("car")) {
                Car c = new Car();

                if (parkingLot.parkVehicle(c)) {
                    LOGGER.info("\nThe car has been parked successfully.");
                    LOGGER.info(parkingLot.toString());
                    LOGGER.info("Please enter bus, car, or motorcycle to park a vehicle (enter 0 to exit): ");
                    inputData = input.next();
                } else {
                    LOGGER.info("\nParking Failed: large spots are full");
                    LOGGER.info("Please enter bus or motorcycle to park a vehicle (enter 0 to exit): ");
                    inputData = input.next();
                }
            } else if (inputData.equals("Motorcycle") || inputData.equals("motorcycle")) {
                MotorCycle m = new MotorCycle();

                if (parkingLot.parkVehicle(m)) {
                    LOGGER.info("\nThe motorcycle has been parked successfully.");
                    LOGGER.info(parkingLot.toString());
                    LOGGER.info("Please enter bus, car, or motorcycle to park a vehicle (enter 0 to exit): ");
                    inputData = input.next();

                } else {
                    LOGGER.info("\nParking Failed: Motorcycle spots are full");
                    LOGGER.info("Please enter Bus or car to park a vehicle (enter 0 to exit): ");
                    inputData = input.next();
                }
            } else {
                LOGGER.info("\nInvalid input.");
                LOGGER.info("\nPlease enter bus, car, or motorcycle to park a vehicle (enter 0 to exit): ");
                inputData = input.next();
            }
            if (inputData.equals("0")) {
                LOGGER.info("\nProgram terminated");
                break;
            }
        }
    }

}