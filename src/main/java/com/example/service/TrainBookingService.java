package com.example.service;

import com.example.model.Ticket;
import com.example.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("trainBookingService")

public class TrainBookingService implements BookingService {
    private final TicketRepository repository;

    @Autowired
    public TrainBookingService(TicketRepository repository) {
        this.repository = repository;
    }

    @Override
    public void bookTicket(Ticket ticket) {
        System.out.println("Booking train ticket: " + ticket);
        repository.addTicket(ticket);
    }
}
