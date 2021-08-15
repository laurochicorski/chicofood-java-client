package com.chicorski.chicofood.client.api.model;

import lombok.Data;

import java.time.OffsetDateTime;

@Data
public class Problem {
    private String userMessage;
    private Integer status;
    private OffsetDateTime timestamp;
}
