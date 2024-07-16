package com.example.HotelService.exception;

public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException() {
        super("Hotel not found on server !!");
    }

    public ResourceNotFoundException(String message){
        super(message);
    }
}
