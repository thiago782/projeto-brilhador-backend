package com.clientRelationship.clientRelationshipProject.models.dto;

import java.util.UUID;

import com.clientRelationship.clientRelationshipProject.models.base.Ticket;
import com.clientRelationship.clientRelationshipProject.models.base.TicketPriority;
import com.clientRelationship.clientRelationshipProject.models.base.TicketStatus;

public class TicketInfo {

    private String title;
    private String description;
    private TicketStatus status;
    private TicketPriority priority;
    public TicketInfo(String title, String description, TicketStatus status, TicketPriority priority) {
        this.title = title;
        this.description = description;
        this.status = status;
        this.priority = priority;
    }

    public Ticket toCompleteTicket(UUID userId, UUID operatorId) {
        return new Ticket(
            title,
            description,
            status,
            priority,
            userId,
            operatorId
        );
    }
}
