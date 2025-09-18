package com.scaler.parkingLot.models;

import java.util.List;

public class ParkingSpot {
    private int id;
    private List<VehicleType> vehicleTypes;
    private SoptStatus soptStatus;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<VehicleType> getVehicleTypes() {
        return vehicleTypes;
    }

    public void setVehicleTypes(List<VehicleType> vehicleTypes) {
        this.vehicleTypes = vehicleTypes;
    }

    public SoptStatus getSoptStatus() {
        return soptStatus;
    }

    public void setSoptStatus(SoptStatus soptStatus) {
        this.soptStatus = soptStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ParkingSpot(int id, List<VehicleType> vehicleTypes, SoptStatus soptStatus, String name) {
        this.id = id;
        this.vehicleTypes = vehicleTypes;
        this.soptStatus = soptStatus;
        this.name = name;
    }
}
