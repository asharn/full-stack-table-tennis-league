package com.table.tennis.service;

import com.table.tennis.model.response.ParticipantResponse;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * Copyright 2021 @asharn
 * @author Ashish Karn
 * @updated_at 2021-05-10T22:21:53+0530
 * @created_at 2021-05-10T22:21:53+0530
 * @since Java-11
 * @version v1.0.0
 */
@Service
public interface ParticipantService {
    List<ParticipantResponse> getAllParticipants();
}
