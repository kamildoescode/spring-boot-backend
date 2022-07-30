package com.kamildoescode.springbootbackend.service;

import com.kamildoescode.springbootbackend.model.DefaultPageResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DefaultPageService {
    public static final String DEFAULT_MESSAGE = "Welcome!";

    private final UtilityService utilityClass;

    public DefaultPageResponse getDefaultPageResponse() {
        // additional processing if needed
        return DefaultPageResponse.builder()
                .timestamp(utilityClass.getUTCTimestamp())
                .message(DEFAULT_MESSAGE)
                .build();
    }
}
