package org.example.Services;

import org.example.Enums.RequestType;
import org.example.dto.Request;

public interface RequestHandler {
    public abstract void placeRequest(Request request);
    public abstract int processRequest(String elevatorId);
}
