package com.table.tennis.api;

import com.table.tennis.contants.RestURIConstants;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.table.tennis.contants.RestURIConstants.PARTICIPANTS;

@RestController
public class ParticipantController {

    @GetMapping(RestURIConstants.PARTICIPANTS)
    public String getParticipants(){
        return "Hello World participant";
    }

    @GetMapping("/")
    public String defaultMethod(){
        return "Welcome to the game of table tennis!!!";
    }

}
