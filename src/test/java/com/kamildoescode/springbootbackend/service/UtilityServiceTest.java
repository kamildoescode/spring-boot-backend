package com.kamildoescode.springbootbackend.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.sql.Timestamp;
import java.time.Clock;

import static org.assertj.core.api.Assertions.assertThat;

public class UtilityServiceTest {

    UtilityService subject = new UtilityService();

    @Test
    @DisplayName("Returns a timestamp UTC")
    void testTimestampUTC() {
        //given
        Timestamp timestamp = Timestamp.from(Clock.systemUTC().instant());

        //when
        Timestamp testTimestamp = subject.getUTCTimestamp();

        //then
        assertThat(timestamp.before(testTimestamp)).isTrue();
    }
}
