package com.table.tennis.service;

import com.table.tennis.model.response.ParticipantResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ParticipantService {
    List<ParticipantResponse> getAllParticipants();
}
