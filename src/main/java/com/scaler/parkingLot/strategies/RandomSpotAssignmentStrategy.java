package com.scaler.parkingLot.strategies;

import com.scaler.parkingLot.exceptions.NoAvailableparkingSpotException;
import com.scaler.parkingLot.models.*;

public class RandomSpotAssignmentStrategy implements  SpotAssignmentStrategy {

    @Override
    public ParkingSpot assignSpot(ParkingLot parkingLot, VehicleType vehicle) throws NoAvailableparkingSpotException {
        for(ParkingFloor floor : parkingLot.getFloors()) {
            for(ParkingSpot parkingSpot: floor.getParkingSpots()){
                if(parkingSpot.getSoptStatus().equals(ParkingSpotStatus.AVAILABLE) && parkingSpot.getVehicleTypes().contains(vehicle)){
                   return parkingSpot;
                }
            }
        }
        throw new NoAvailableparkingSpotException("No Spot Available");
    }
}
