package com.kamildoescode.springbootbackend.model;

import lombok.Builder;
import lombok.Data;

import java.sql.Timestamp;

@Data
@Builder
public class DefaultPageResponse {
    private String message;
    private Timestamp timestamp;
}
