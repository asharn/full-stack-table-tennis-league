package com.table.tennis.api;

import com.table.tennis.model.dto.MatchDto;
import com.table.tennis.model.dto.RegistrationDto;
import com.table.tennis.model.response.ApiResponse;
import com.table.tennis.model.response.ParticipantResponse;
import com.table.tennis.service.MatchService;
import com.table.tennis.service.ParticipantService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
public class ParticipantControllerUnitTest {

    @InjectMocks
    private ParticipantController participantController;

    @Mock
    private ParticipantService participantService;

    @Test
    public void getParticipants(){
        List<ParticipantResponse> participantResponses = getParticipantsResponse();
        when(participantService.getAllParticipants()).thenReturn(participantResponses);
        ResponseEntity<ApiResponse> response = participantController.getParticipants();
        Assert.assertNotNull(response);
        Assert.assertSame(participantResponses, Objects.requireNonNull(response.getBody()).getData());
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
