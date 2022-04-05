package com.clientRelationship.clientRelationshipProject.services;

import java.util.UUID;

import com.clientRelationship.clientRelationshipProject.models.base.Ticket;
import com.clientRelationship.clientRelationshipProject.models.dto.TicketInfo;
import com.clientRelationship.clientRelationshipProject.repositories.TicketRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateTicketService {

    @Autowired
    TicketRepository ticketRepository;

    public Ticket createTicketForUser(
        UUID userId,
        TicketInfo ticketInfo
    ) {
        Ticket ticket = ticketInfo.toCompleteTicket(userId, new UUID(0, 0));
        return ticketRepository.save(ticket);
    }    
}
