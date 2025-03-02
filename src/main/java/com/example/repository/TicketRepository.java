package com.example.repository;

import com.example.model.Ticket;
import java.util.List;

public interface TicketRepository {
    void addTicket(Ticket ticket);
    List<Ticket> getAllTickets();
}
