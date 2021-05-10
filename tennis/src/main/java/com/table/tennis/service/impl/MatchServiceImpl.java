package com.table.tennis.service.impl;

import com.table.tennis.mapper.MatchMapper;
import com.table.tennis.model.dto.MatchDto;
import com.table.tennis.model.entity.Match;
import com.table.tennis.repository.MatchRepository;
import com.table.tennis.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MatchServiceImpl implements MatchService {

    @Autowired
    private MatchRepository matchRepository;

    @Autowired
    @Qualifier("matchMapperImpl")
    private MatchMapper matchMapper;

    @Override
    public List<MatchDto> getMatches() {
        List<MatchDto> matchDtos = new ArrayList<>();
        List<Match> matches = matchRepository.findAll();
        if(!CollectionUtils.isEmpty(matches)){
            matchDtos = matches.stream().map(x-> matchMapper.toDTO(x)).collect(Collectors.toList());
        }
        return matchDtos;
    }

    @Override
    public List<MatchDto> getMatchesByRound(Integer round) {
        List<MatchDto> matchDtos = new ArrayList<>();
        List<Match> matches = matchRepository.findAllByRound(round);
        if(!CollectionUtils.isEmpty(matches)){
            matchDtos = matches.stream().map(x-> matchMapper.toDTO(x)).collect(Collectors.toList());
        }
        return matchDtos;
    }
}
