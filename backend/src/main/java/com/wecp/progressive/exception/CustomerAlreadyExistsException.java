package com.wecp.progressive.exception;

public class CustomerAlreadyExistsException extends RuntimeException{
    public CustomerAlreadyExistsException(String arg0){
        super(arg0);
    }
}