package com.scaler.parkingLot.controllers;

import com.scaler.parkingLot.dtos.CreateTicketRequestDto;
import com.scaler.parkingLot.dtos.CreateTicketResponseDto;
import com.scaler.parkingLot.exceptions.NoAvailableparkingSpotException;
import com.scaler.parkingLot.models.Ticket;
import com.scaler.parkingLot.services.TicketService;

public class TicketController {
    private TicketService ticketService;
    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public CreateTicketResponseDto createTicket(CreateTicketRequestDto request) {
        try {
            Ticket ticket = ticketService.createTicket(request.getVehicle(), request.getGate());
            CreateTicketResponseDto response = new CreateTicketResponseDto();
            response.setTicket(ticket);
            return response;
        }
        catch (NoAvailableparkingSpotException e) {
            CreateTicketResponseDto response = new CreateTicketResponseDto();
            response.setMessage(e.getMessage());
        }
        return null;
    }
}
