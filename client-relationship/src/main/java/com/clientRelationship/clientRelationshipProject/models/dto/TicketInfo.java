package com.clientRelationship.clientRelationshipProject.models.dto;

import java.util.UUID;

import com.clientRelationship.clientRelationshipProject.models.base.Ticket;

public class TicketInfo {

    private String title;
    private String description;
    private String status;
    private String priority;
    public TicketInfo(String title, String description, String status, String priority) {
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
