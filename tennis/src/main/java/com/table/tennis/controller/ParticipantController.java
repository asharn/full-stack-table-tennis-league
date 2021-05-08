package com.table.tennis.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/participant")
public class ParticipantController {

    @GetMapping("/all")
    public String getParticipants(){
        return "Hello World";
    }

}
