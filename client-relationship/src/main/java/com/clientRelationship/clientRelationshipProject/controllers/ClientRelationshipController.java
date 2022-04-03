package com.clientRelationship.clientRelationshipProject.controllers;
import java.util.ArrayList;

import com.clientRelationship.clientRelationshipProject.models.base.Ticket;
import com.clientRelationship.clientRelationshipProject.models.dto.TicketInfo;
import com.clientRelationship.clientRelationshipProject.models.dto.UserResponse;
import com.clientRelationship.clientRelationshipProject.models.exceptions.NotFound;
import com.clientRelationship.clientRelationshipProject.services.ClientRelationshipService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Client Relationship")
@RestController @RequestMapping(path = "")
public class ClientRelationshipController {

    @Autowired
    ClientRelationshipService service;

    @PostMapping(path = "")
    public ResponseEntity<Ticket> get(
        @RequestAttribute("user") UserResponse user,
        TicketInfo info
    ) {
        try {
            Ticket ticket = service.createTicketForUser(user.getId(), info);
            return ResponseEntity.status(200).body(ticket);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return ResponseEntity.badRequest().build();
        }
    }


    @GetMapping(path = "")
    public ResponseEntity<Ticket[]> get(
        @RequestAttribute("user") UserResponse user
    ) {
        try {
        Ticket[] tickets = service.getAllForUser(user.getId());
        return ResponseEntity.status(200).body(tickets);
        } catch (NotFound e) {
            System.out.println(e.getMessage());
            return ResponseEntity.status(200).body(new ArrayList<Ticket>(0).toArray(new Ticket[0]));
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return ResponseEntity.badRequest().build();
        
        }
    }

}
