package com.scaler.parkingLot.strategies;

import com.scaler.parkingLot.models.ParkingLot;
import com.scaler.parkingLot.models.ParkingSpot;
import com.scaler.parkingLot.models.VehicleType;

public interface SpotAssignmentStrategy {
    ParkingSpot assignSpot(ParkingLot parkingLot, VehicleType vehicle);
}
