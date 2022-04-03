package com.clientRelationship.project.controllers;
import com.clientRelationship.project.services.ClientRelationshipService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Client Relationship")
@RestController @RequestMapping(path = "")
public class ClientRelationshipController {

    @Autowired
    ClientRelationshipService service;
}
