package com.kamildoescode.springbootbackend.service;

import com.kamildoescode.springbootbackend.model.DefaultPageResponse;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.sql.Timestamp;

import static com.kamildoescode.springbootbackend.Fixture.anUTCTimestamp;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class DefaultPageServiceTest {

    @Mock
    UtilityService utilityClass;

    @InjectMocks
    DefaultPageService subject;

    @Test
    @DisplayName("Test get default page returns DefaultPageResponse")
    void testGetDefaultPage() {
        //given
        Timestamp timestamp = anUTCTimestamp();

        when(utilityClass.getUTCTimestamp()).thenReturn(timestamp);

        //when
        DefaultPageResponse defaultPageResponse = subject.getDefaultPageResponse();

        //then
        assertThat(defaultPageResponse.getMessage()).isEqualTo(DefaultPageService.DEFAULT_MESSAGE);
        assertThat(defaultPageResponse.getTimestamp()).isEqualTo(timestamp);
    }
}
