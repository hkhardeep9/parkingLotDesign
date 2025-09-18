package com.scaler.parkingLot.models;

public class Payment {
    private int id;
    private PaymentMode paymentMode;
    //Add payment provider
    private PaymentStatus paymentStatus;
    private long referenceId;
    private double amount;

    public Payment(int id, PaymentMode paymentMode, PaymentStatus paymentStatus, long referenceId, double amount) {
        this.id = id;
        this.paymentMode = paymentMode;
        this.paymentStatus = paymentStatus;
        this.referenceId = referenceId;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public long getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(long referenceId) {
        this.referenceId = referenceId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
