package com.example.repository;

import com.example.model.Ticket;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class TicketRepositoryIml implements TicketRepository {
    private final List<Ticket> tickets = new ArrayList<>();

    @Override
    public void addTicket(Ticket ticket) {
        tickets.add(ticket);
    }

    @Override
    public List<Ticket> getAllTickets() {
        return tickets;
    }
}
