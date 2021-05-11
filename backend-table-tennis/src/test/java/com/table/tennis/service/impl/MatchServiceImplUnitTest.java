package com.table.tennis.service.impl;

import com.table.tennis.mapper.MatchMapper;
import com.table.tennis.model.dto.MatchDto;
import com.table.tennis.model.entity.Match;
import com.table.tennis.model.entity.Registration;
import com.table.tennis.repository.MatchRepository;
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
public class MatchServiceImplUnitTest {

    @InjectMocks
    private MatchServiceImpl matchServiceImpl;

    @Mock
    private MatchRepository matchRepository;

    @Mock
    private MatchMapper matchMapper;

    @Test
    public void getMatches(){
        List<Match> matches = getMatch(3);
        when(matchRepository.findAll()).thenReturn(matches);
        List<MatchDto> matchDtos = matchServiceImpl.getMatches();
        Assert.assertNotNull(matchDtos);
        Assert.assertEquals(matches.size(), matchDtos.size());
    }

    @Test
    public void getMatchesByRound(){
        List<Match> matches = getMatch(1);
        when(matchRepository.findAllByRound(1)).thenReturn(matches);
        List<MatchDto> matchDtos = matchServiceImpl.getMatchesByRound(1);
        Assert.assertNotNull(matchDtos);
        Assert.assertEquals(matches.size(), matchDtos.size());
    }

    /**
     * This method will help to create Match related DTO Objects.
     * @return List<MatchDto>
     * @param round int
     */
    private List<Match> getMatch(int round) {
        List<Match> matches = new ArrayList<>();
        Match match = new Match();
        match.setId(1);
        match.setRound(round);
        match.setFirstRegistrationId(new Registration());
        matches.add(match);
        return matches;
    }

}
