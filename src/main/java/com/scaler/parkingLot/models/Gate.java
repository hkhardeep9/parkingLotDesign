package com.scaler.parkingLot.models;

public class Gate extends BaseModel{
    String name;
    GateType gateType;
    Operator operator;

    public Gate(String name, GateType gateType, Operator operator) {
        this.name = name;
        this.gateType = gateType;
        this.operator = operator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GateType getGateType() {
        return gateType;
    }

    public void setGateType(GateType gateType) {
        this.gateType = gateType;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }
}
