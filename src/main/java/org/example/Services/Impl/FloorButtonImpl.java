package org.example.Services.Impl;

import org.example.Services.Button;
import org.example.Services.RequestHandler;
import org.example.dto.Request;

public class FloorButtonImpl extends Button {
    RequestHandler requestHandler = SCANRequestHandlerImpl.getInstance();
    @Override
    public void placeRequest() {
        Request request = Request.builder().build();
        requestHandler.placeRequest(request);
    }
}
