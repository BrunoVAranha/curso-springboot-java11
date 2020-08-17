package com.educandoweb.course.services.exceptions;

import com.educandoweb.course.resources.exceptions.StandardError;

public class DatabaseException extends RuntimeException {

    public DatabaseException( String msg){
        super(msg);
    }
}
