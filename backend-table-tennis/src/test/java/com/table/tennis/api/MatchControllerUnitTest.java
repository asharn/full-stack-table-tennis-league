package com.table.tennis.api;

import com.table.tennis.model.dto.MatchDto;
import com.table.tennis.model.dto.RegistrationDto;
import com.table.tennis.model.response.ApiResponse;
import com.table.tennis.service.MatchService;
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
public class MatchControllerUnitTest {

    @InjectMocks
    private MatchController matchController;

    @Mock
    private MatchService matchService;

    @Test
    public void getMatches(){
        List<MatchDto> matchDtos = getMatchDtos(3);
        when(matchService.getMatches()).thenReturn(matchDtos);
        ResponseEntity<ApiResponse> response = matchController.getMatches();
        Assert.assertNotNull(response);
        Assert.assertSame(matchDtos, Objects.requireNonNull(response.getBody()).getData());
    }

    @Test
    public void getMatchesByRound(){
        List<MatchDto> matchDtos = getMatchDtos(1);
        when(matchService.getMatchesByRound(1)).thenReturn(matchDtos);
        ResponseEntity<ApiResponse> response = matchController.getMatchesByRound(1);
        Assert.assertNotNull(response);
        Assert.assertSame(matchDtos, Objects.requireNonNull(response.getBody()).getData());
    }

    /**
     * This method will help to create Match related DTO Objects.
     * @return List<MatchDto>
     * @param round int
     */
    private List<MatchDto> getMatchDtos(int round) {
        List<MatchDto> matchDtos = new ArrayList<>();
        MatchDto matchDto = new MatchDto();
        matchDto.setId(1);
        matchDto.setRound(round);
        matchDto.setFirstRegistrationId(new RegistrationDto());
        matchDtos.add(matchDto);
        return matchDtos;
    }

}
