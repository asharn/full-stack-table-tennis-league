package com.table.tennis.model.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

import java.util.Date;

@Data
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class ApiResponse {
    private Integer statusCode;
    private String statusMessage;
    private Object data;
    @JsonFormat
    private Date timeStamp = new Date();
}
