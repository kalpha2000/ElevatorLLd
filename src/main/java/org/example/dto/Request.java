package org.example.dto;


import lombok.Builder;
import lombok.Data;
import org.example.Enums.RequestType;

@Builder
@Data
public class Request {
    private RequestType requestType;
    private int floor;
    private String elevatorId;
}
