package com.fellipeAzevedo.course.services.exceptions;

public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(Object id) {
        super("resource not found: " + id);
    }
}
