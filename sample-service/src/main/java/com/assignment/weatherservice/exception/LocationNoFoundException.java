package com.assignment.weatherservice.exception;

public class LocationNoFoundException extends Exception {

    public LocationNoFoundException(final String message) {
        super(message);
    }
}
