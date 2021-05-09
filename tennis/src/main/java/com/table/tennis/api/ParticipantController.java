package com.table.tennis.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ParticipantController {

    @GetMapping("/participant")
    public String getParticipants(){
        return "Hello World participant";
    }

    @GetMapping("/")
    public String defaultMethod(){
        return "Hello World";
    }

}
