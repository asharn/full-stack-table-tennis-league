package com.table.tennis.api;

import com.table.tennis.contants.RestURIConstants;
import com.table.tennis.model.response.ApiResponse;
import com.table.tennis.service.ParticipantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * Copyright 2021 @asharn
 * @author Ashish Karn
 * @updated_at 2021-05-10T22:21:53+0530
 * @created_at 2021-05-10T22:21:53+0530
 * @since Java-11
 * @version v1.0.0
 */
@RestController
public class ParticipantController {

    @Autowired
    private ParticipantService participantService;

    @GetMapping(RestURIConstants.PARTICIPANTS)
    public ResponseEntity<ApiResponse> getParticipants() {
        ApiResponse apiResponse =  new ApiResponse();
        apiResponse.setStatusCode(1000);
        apiResponse.setStatusMessage("Success");
        apiResponse.setData(participantService.getAllParticipants());
        return new ResponseEntity<>(apiResponse,HttpStatus.OK);
    }

    @GetMapping("/")
    public ResponseEntity<String> defaultMethod() {
        return new ResponseEntity<>("Welcome to the game of table tennis!!!", HttpStatus.OK);
    }

}
