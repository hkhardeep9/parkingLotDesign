package com.scaler.parkingLot.services;

import com.scaler.parkingLot.exceptions.NoAvailableparkingSpotException;
import com.scaler.parkingLot.models.*;
import com.scaler.parkingLot.repositories.ParkingLotRepository;
import com.scaler.parkingLot.repositories.ParkingSpotRepository;
import com.scaler.parkingLot.repositories.TicketRepository;
import com.scaler.parkingLot.strategies.SpotAssignmentStrategy;

import java.util.Date;

public class TicketService {
    private TicketRepository ticketRepository;
    private SpotAssignmentStrategy spotAssignmentStrategy;
    private ParkingLotRepository parkingLotRepository;
    private ParkingSpotRepository parkingSpotRepository;
    public TicketService(TicketRepository ticketRepository, SpotAssignmentStrategy spotAssignmentStrategy, ParkingLotRepository parkingLotRepository
    ,ParkingLotRepository parkingSpotRepository) {
        this.ticketRepository = ticketRepository;
        this.spotAssignmentStrategy = spotAssignmentStrategy;
        this.parkingLotRepository = parkingLotRepository;
        this.parkingLotRepository = parkingLotRepository;
    }
    public Ticket createTicket(Vehicle vehicle, Gate gate) throws NoAvailableparkingSpotException {

        //private Vehicle vehicle;
        //private Operator operator;
        //private Gate gate;
        //private ParkingSpot parkingSpot;

        Ticket ticket = new Ticket();
        ticket.setEntryTime(new Date());
        ticket.setGate(gate);
        ticket.setOperator(gate.getOperator());
        ticket.setVehicle(vehicle);
        ParkingSpot parkingSpot = spotAssignmentStrategy.assignSpot(parkingLotRepository.getParkingLotForGate(gate), vehicle.getVehicleType());
        parkingSpot.setSoptStatus(ParkingSpotStatus.FILLED);
        parkingSpotRepository.save(parkingSpot);
        ticket.setParkingSpot(parkingSpot);

        return ticketRepository.save(ticket);
    }
}
