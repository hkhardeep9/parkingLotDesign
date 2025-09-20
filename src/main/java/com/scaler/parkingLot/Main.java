package com.scaler.parkingLot;

import com.scaler.parkingLot.controllers.TicketController;
import com.scaler.parkingLot.dtos.CreateTicketRequestDto;
import com.scaler.parkingLot.dtos.CreateTicketResponseDto;
import com.scaler.parkingLot.exceptions.NoAvailableparkingSpotException;
import com.scaler.parkingLot.models.ParkingLot;
import com.scaler.parkingLot.repositories.ParkingLotRepository;
import com.scaler.parkingLot.repositories.ParkingSpotRepository;
import com.scaler.parkingLot.repositories.TicketRepository;
import com.scaler.parkingLot.services.TicketService;
import com.scaler.parkingLot.strategies.RandomSpotAssignmentStrategy;
import com.scaler.parkingLot.strategies.SpotAssignmentStrategy;

public class Main {
    public static void main(String[] args) throws NoAvailableparkingSpotException {
        ObjectRegistry objectRegistry  = new ObjectRegistry();
        objectRegistry.register( "parkingLotRepositorty",new ParkingLotRepository());
        objectRegistry.register( "parkingSpotRepository",new ParkingSpotRepository());
        objectRegistry.register( "ticketRepository",new TicketRepository());
        objectRegistry.register("randomSpotAssignmentStrategy",new RandomSpotAssignmentStrategy());
        objectRegistry.register("ticketService",new TicketService((TicketRepository) objectRegistry.get("ticketRepository"),
                (SpotAssignmentStrategy) objectRegistry.get("randomSpotAssignmentStrategy"),
                (ParkingLotRepository) objectRegistry.get("parkingSpotRepository"),
                (ParkingLotRepository) objectRegistry.get("parkingSpotRepository")));

        objectRegistry.register("ticketController",new TicketController(
                (TicketService)objectRegistry.get("ticketService")));

        CreateTicketRequestDto  createTicketRequestDto = new CreateTicketRequestDto();
        createTicketRequestDto.setGate(null);
        createTicketRequestDto.setVehicle(null);

        CreateTicketResponseDto response = ((TicketController)objectRegistry.get("ticketController")).createTicket(createTicketRequestDto);
    }
}
