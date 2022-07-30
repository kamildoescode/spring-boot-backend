package com.kamildoescode.springbootbackend.service;

import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.Clock;

@Service
public class UtilityService {
    public Timestamp getUTCTimestamp() {
        return Timestamp.from(Clock.systemUTC().instant());
    }
}
