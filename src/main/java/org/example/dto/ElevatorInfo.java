package org.example.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ElevatorInfo {
    private String elevatorId;
    private int floor;
}
