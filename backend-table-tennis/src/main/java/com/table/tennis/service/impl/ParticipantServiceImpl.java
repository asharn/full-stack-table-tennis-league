package com.table.tennis.service.impl;

import com.table.tennis.model.entity.PlayingIn;
import com.table.tennis.model.entity.Registration;
import com.table.tennis.model.entity.RegistrationPlayer;
import com.table.tennis.model.response.ParticipantResponse;
import com.table.tennis.repository.PlayingInRepository;
import com.table.tennis.repository.RegistrationPlayerRepository;
import com.table.tennis.service.ParticipantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
/**
 * Copyright 2021 @asharn
 * @author Ashish Karn
 * @updated_at 2021-05-10T22:21:53+0530
 * @created_at 2021-05-10T22:21:53+0530
 * @since Java-11
 * @version v1.0.0
 */
@Service
public class ParticipantServiceImpl implements ParticipantService {

    @Autowired
    private PlayingInRepository playingInRepository;

    @Autowired
    private RegistrationPlayerRepository registrationPlayerRepository;

    @Override
    public List<ParticipantResponse> getAllParticipants() {
        List<ParticipantResponse> participantResponses = new ArrayList<>();

        List<PlayingIn> playingIns = playingInRepository.findAll();
        if(!CollectionUtils.isEmpty(playingIns)){
            List<Registration> registrations = playingIns.stream().map(PlayingIn::getRegistration).collect(Collectors.toList());
            List<RegistrationPlayer> registrationPlayers = registrationPlayerRepository.findAllByRegistrationIn(registrations);
            participantResponses = registrationPlayers.stream().map(x->{
                ParticipantResponse participantResponse = new ParticipantResponse();
                participantResponse.setFirstName(x.getPlayer().getFirstName());
                participantResponse.setLastName(x.getPlayer().getLastName());
                participantResponse.setEmail(x.getPlayer().getEmail());
                return participantResponse;
            }).collect(Collectors.toList());
        }

        return participantResponses;
    }
}
