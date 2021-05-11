package com.table.tennis.service.impl;

import com.table.tennis.model.entity.MatchIdPK;
import com.table.tennis.model.entity.MatchResult;
import com.table.tennis.model.request.TournamentWinnerRequest;
import com.table.tennis.model.response.ApiResponse;
import com.table.tennis.repository.MatchRepository;
import com.table.tennis.repository.MatchResultRepository;
import com.table.tennis.repository.RegistrationRepository;
import com.table.tennis.service.TournamentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * Copyright 2021 @asharn
 * @author Ashish Karn
 * @updated_at 2021-05-10T22:21:53+0530
 * @created_at 2021-05-10T22:21:53+0530
 * @since Java-11
 * @version v1.0.0
 */
@Service
public class TournamentServiceImpl implements TournamentService {

    @Autowired
    private MatchResultRepository matchResultRepository;

    @Autowired
    private MatchRepository matchRepository;

    @Autowired
    private RegistrationRepository registrationRepository;

    @Override
    public ApiResponse updateTournamentWinner(TournamentWinnerRequest tournamentWinnerRequest) {
        var apiResponse =  new ApiResponse();
        apiResponse.setStatusCode(4000);
        apiResponse.setStatusMessage("Fail");
        if(Objects.isNull(tournamentWinnerRequest.getMatchId())){
            apiResponse.setData("Match id is mandatory.");
        }else if(Objects.isNull(tournamentWinnerRequest.getRegistrationId())){
            apiResponse.setData("Winner Registration id is mandatory.");
        }else if(Objects.isNull(tournamentWinnerRequest.getNoOfSetPlayed())){
            apiResponse.setData("Number of set played will not be empty.");
        }else if(!matchRepository.existsById(tournamentWinnerRequest.getMatchId())) {
            apiResponse.setData("Match id doesn't found in the system.");
        }else if(!registrationRepository.existsById(tournamentWinnerRequest.getRegistrationId())){
            apiResponse.setData("Registration id doesn't found in the system.");
        }else if(matchResultRepository.existsById(new MatchIdPK(tournamentWinnerRequest.getMatchId()))){
            apiResponse.setData("Winner is already updated in the system with respect to given match id.");
        }else{
            var matchResult = new MatchResult();
            matchResult.setMatchId(new MatchIdPK(tournamentWinnerRequest.getMatchId()));
            matchResult.setMatch(matchRepository.findById(tournamentWinnerRequest.getMatchId()).get());
            matchResult.setIsOpponentRetired(tournamentWinnerRequest.isOpponentRetired());
            matchResult.setRegistration(registrationRepository.findById(tournamentWinnerRequest.getRegistrationId()).get());
            matchResult.setNumberOfSetsPlayed(tournamentWinnerRequest.getNoOfSetPlayed());
            matchResultRepository.save(matchResult);
            apiResponse.setStatusCode(1000);
            apiResponse.setStatusMessage("Success");
            apiResponse.setData("League champion updated successfully.");
        }
        return apiResponse;
    }
}
