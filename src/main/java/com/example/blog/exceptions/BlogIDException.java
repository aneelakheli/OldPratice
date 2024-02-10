package com.example.blog.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BlogIDException extends RuntimeException{
    public BlogIDException(String message){
        super( message);
    }
}
