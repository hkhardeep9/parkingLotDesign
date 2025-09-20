package com.scaler.parkingLot.models;

import java.util.Date;

public class Ticket extends BaseModel{
    private Date entryTime;
    private Vehicle vehicle;
    private Operator operator;
    private Gate gate;
    private ParkingSpot parkingSpot;

    public Ticket(Vehicle vehicle, Operator operator, Gate gate, ParkingSpot parkingSpot, Date entryTime) {
        this.vehicle = vehicle;
        this.operator = operator;
        this.gate = gate;
        this.parkingSpot = parkingSpot;
        this.entryTime = entryTime;
    }

    public Ticket() {}

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

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }
}
