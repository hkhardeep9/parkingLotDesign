package com.scaler.parkingLot.models;

import java.util.List;

public class ParkingLot extends BaseModel{
    private String name;
    private List<ParkingFloor> floors;
    private List<Gate> gates;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ParkingFloor> getFloors() {
        return floors;
    }

    public void setFloors(List<ParkingFloor> floors) {
        this.floors = floors;
    }

    public List<Gate> getGates() {
        return gates;
    }

    public void setGates(List<Gate> gates) {
        this.gates = gates;
    }

    public ParkingLot(String name, List<ParkingFloor> floors, List<Gate> gates) {
        this.name = name;
        this.floors = floors;
        this.gates = gates;
    }
}
