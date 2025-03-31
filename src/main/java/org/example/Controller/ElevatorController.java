package org.example.Controller;

import lombok.Getter;
import org.example.Services.Elevator;
import org.example.Services.Impl.SCANRequestHandlerImpl;
import org.example.Services.RequestHandler;
import org.example.dto.ElevatorInfo;

import java.util.List;
import java.util.UUID;

public class ElevatorController {
    private final Elevator elevator;
    @Getter
    private ElevatorInfo elevatorInfo;
    private final RequestHandler requestHandler = SCANRequestHandlerImpl.getInstance();

    public ElevatorController(Elevator elevator) {
        this.elevator = elevator;
        this.elevatorInfo.setFloor(0);
        this.elevatorInfo.setElevatorId(UUID.randomUUID().toString());
    }

    public void shutDown() {

    }

    public void reset() {

    }

    public void start() {

    }


    public void reqProcessor() {
        int getFloor = requestHandler.processRequest(elevatorInfo.getElevatorId());
        if(getFloor > elevatorInfo.getFloor()) {
            elevator.moveUp();
        } else if(getFloor < elevatorInfo.getFloor()) {
            elevator.moveDown();
        } else {
            elevator.openDoor();
        }
    }

}
