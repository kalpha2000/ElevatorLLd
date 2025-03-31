package org.example.Services.Impl;

import org.example.Services.Button;
import org.example.Services.Elevator;
import org.example.Services.RequestHandler;

public class ElevatorButtonImpl extends Button {
    public static RequestHandler requestHandlerService = SCANRequestHandlerImpl.getInstance();

    public void placeRequest(String elevatorId) {

    }

    @Override
    public void placeRequest() {

    }
}
