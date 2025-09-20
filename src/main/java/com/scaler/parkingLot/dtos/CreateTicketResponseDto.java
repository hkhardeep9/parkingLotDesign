package com.scaler.parkingLot.dtos;

import com.scaler.parkingLot.models.Ticket;

public class CreateTicketResponseDto {
    private Ticket ticket;

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
}
