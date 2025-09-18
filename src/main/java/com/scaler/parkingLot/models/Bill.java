package com.scaler.parkingLot.models;


import java.util.List;

public class Bill {
    private int id;
    private double amount;
    private long exitTime;
    private List<Payment> payments;
    private Operator operator;
    private Gate gate;
    private BillStatus status;

    public Bill(int id, double amount, long exitTime, List<Payment> payments, Operator operator, Gate gate, BillStatus status) {
        this.id = id;
        this.amount = amount;
        this.exitTime = exitTime;
        this.payments = payments;
        this.operator = operator;
        this.gate = gate;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public long getExitTime() {
        return exitTime;
    }

    public void setExitTime(long exitTime) {
        this.exitTime = exitTime;
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
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

    public BillStatus getStatus() {
        return status;
    }

    public void setStatus(BillStatus status) {
        this.status = status;
    }
}
