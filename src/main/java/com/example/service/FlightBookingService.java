package com.example.service;

import com.example.model.Ticket;
import com.example.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class FlightBookingService implements BookingService {
    private final TicketRepository repository;

    @Autowired
    public FlightBookingService(TicketRepository repository) {
        this.repository = repository;
    }

    @Override
    public void bookTicket(Ticket ticket) {
        System.out.println("Booking flight ticket: " + ticket);
        repository.addTicket(ticket);
    }
}
