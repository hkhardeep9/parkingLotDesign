package com.scaler.parkingLot.repositories;

import com.scaler.parkingLot.models.Ticket;

import java.util.HashMap;
import java.util.Map;

public class TicketRepository {
    //We will not use list here because seraching will be O(n) in that case
    private Map<Long,Ticket> tickets = new HashMap<>();
    private long lastIdCount = 0;

    public Ticket save(Ticket ticket) {
         ticket.setId(lastIdCount+1);
         lastIdCount++;
         tickets.put(ticket.getId(),ticket);
         return ticket;
    }

}
