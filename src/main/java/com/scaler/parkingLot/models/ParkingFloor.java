package com.scaler.parkingLot.models;

import java.util.List;

public class ParkingFloor {
    private int id;
    private List<ParkingSpot> parkingSpots;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }

    public void setParkingSpots(List<ParkingSpot> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }

    public ParkingFloor(List<ParkingSpot> parkingSpots, int id) {
        this.parkingSpots = parkingSpots;
        this.id = id;
    }
}
