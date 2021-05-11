package com.table.tennis.api;

import com.table.tennis.contants.RestURIConstants;
import com.table.tennis.model.request.TournamentWinnerRequest;
import com.table.tennis.model.response.ApiResponse;
import com.table.tennis.service.MatchService;
import com.table.tennis.service.TournamentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
public class TournamentController {

    @Autowired
    private TournamentService tournamentService;

    @PostMapping(value = RestURIConstants.TOURNAMENT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ApiResponse> updateTournamentWinner(@RequestBody TournamentWinnerRequest tournamentWinnerRequest) {
        var apiResponse = tournamentService.updateTournamentWinner(tournamentWinnerRequest);
        return new ResponseEntity<>(apiResponse,apiResponse.getStatusCode()==1000?HttpStatus.OK:HttpStatus.NOT_ACCEPTABLE);
    }

}
