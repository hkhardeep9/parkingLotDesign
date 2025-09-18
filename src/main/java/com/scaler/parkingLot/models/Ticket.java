package com.scaler.parkingLot.models;

public class Ticket {
    private int id;
    private Vehicle vehicle;
    private Operator operator;
    private Gate gate;
    private ParkingSpot parkingSpot;

    public Ticket(int id, Vehicle vehicle, Operator operator, Gate gate, ParkingSpot parkingSpot) {
        this.id = id;
        this.vehicle = vehicle;
        this.operator = operator;
        this.gate = gate;
        this.parkingSpot = parkingSpot;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public Gate getGate() {
        return gate;
    }

    public void setGate(Gate gate) {
        this.gate = gate;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }
}
