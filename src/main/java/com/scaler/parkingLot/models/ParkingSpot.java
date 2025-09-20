package com.scaler.parkingLot.models;

import java.util.List;

public class ParkingSpot extends BaseModel{
    private List<VehicleType> vehicleTypes;
    private ParkingSpotStatus parkingSpotStatus;
    private String name;

    public List<VehicleType> getVehicleTypes() {
        return vehicleTypes;
    }

    public void setVehicleTypes(List<VehicleType> vehicleTypes) {
        this.vehicleTypes = vehicleTypes;
    }

    public ParkingSpotStatus getSoptStatus() {
        return parkingSpotStatus;
    }

    public void setSoptStatus(ParkingSpotStatus parkingSpotStatus) {
        this.parkingSpotStatus = parkingSpotStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ParkingSpot(List<VehicleType> vehicleTypes, ParkingSpotStatus parkingSpotStatus, String name) {
        this.vehicleTypes = vehicleTypes;
        this.parkingSpotStatus = parkingSpotStatus;
        this.name = name;
    }
}
