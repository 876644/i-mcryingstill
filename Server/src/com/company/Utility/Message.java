package com.company.Utility;

import com.company.Commands.AbstractCommand;

import java.io.Serializable;

public class Message implements Serializable {
    public String message;
    public Message(String message){
        this.message = message;
    }
}
