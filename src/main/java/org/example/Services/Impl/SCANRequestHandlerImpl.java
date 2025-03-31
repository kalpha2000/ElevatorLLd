package org.example.Services.Impl;


import org.example.Controller.ElevatorController;
import org.example.Services.Elevator;
import org.example.Services.RequestHandler;
import org.example.dto.Request;

import java.util.*;
import java.util.stream.Collectors;

public class SCANRequestHandlerImpl implements RequestHandler {
    private LinkedList<Request> commonRequest = new LinkedList<>();
    private Map<String, LinkedList<Request>> elevatorRequestMap = new HashMap<>();
    private Map<String, ElevatorController> elevatorControllerMap = new HashMap<>();

    private static SCANRequestHandlerImpl instance;
    private SCANRequestHandlerImpl() {
    }
    @Override
    public void placeRequest(Request request) {

    }

    @Override
    public int processRequest(String elevatorId) {
        // uses common request pool and particular elevators request to pool to take best decission
        return 0;
    }

    public void populateMap(List<ElevatorController> elevatorControllerList) {
        elevatorControllerMap = elevatorControllerList
                .stream()
                .collect(Collectors.toMap(
                        elevatorController -> elevatorController.getElevatorInfo().getElevatorId(),
                        elevatorController -> elevatorController));
    }
    public static SCANRequestHandlerImpl getInstance() {
        if(instance==null) {
            instance = new SCANRequestHandlerImpl();
        }
        return instance;
    }
}
