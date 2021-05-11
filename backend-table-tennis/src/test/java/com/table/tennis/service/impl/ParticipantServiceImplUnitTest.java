package com.table.tennis.service.impl;

import com.table.tennis.model.entity.PlayingIn;
import com.table.tennis.model.entity.Registration;
import com.table.tennis.model.entity.RegistrationPlayer;
import com.table.tennis.model.response.ParticipantResponse;
import com.table.tennis.repository.PlayingInRepository;
import com.table.tennis.repository.RegistrationPlayerRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
public class ParticipantServiceImplUnitTest {

    @InjectMocks
    private ParticipantServiceImpl participantServiceImpl;

    @Mock
    private PlayingInRepository playingInRepository;

    @Mock
    private RegistrationPlayerRepository registrationPlayerRepository;

    @Test
    public void getParticipants(){
        List<PlayingIn> playingIns = new ArrayList<>();
        when(playingInRepository.findAll()).thenReturn(playingIns);
        List<Registration> registrations = new ArrayList<>();
        List<RegistrationPlayer> registrationPlayers = new ArrayList<>();
        when(registrationPlayerRepository.findAllByRegistrationIn(registrations)).thenReturn(registrationPlayers);
        List<ParticipantResponse> participantResponses = participantServiceImpl.getAllParticipants();
        Assert.assertNotNull(participantResponses);
        Assert.assertEquals(0,participantResponses.size());
    }

    /**
     * This method will help to create ParticipantResponse related DTO Objects.
     * @return List<ParticipantResponse>
     */
    private List<ParticipantResponse> getParticipantsResponse() {
        List<ParticipantResponse> participantResponses = new ArrayList<>();
        ParticipantResponse participantResponse = new ParticipantResponse();
        participantResponse.setFirstName("ABC");
        participantResponse.setLastName("XYZ");
        participantResponse.setEmail("abc@xyz.com");
        participantResponses.add(participantResponse);
        return participantResponses;
    }

}
