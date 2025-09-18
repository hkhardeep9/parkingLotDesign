package com.scaler.parkingLot.models;

import java.util.List;

public class ParkingLot {
    private int id;
    private String name;
    private List<ParkingFloor> floors;
    private List<Gate> gates;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public ParkingLot(int id, String name, List<ParkingFloor> floors, List<Gate> gates) {
        this.id = id;
        this.name = name;
        this.floors = floors;
        this.gates = gates;
    }
}
