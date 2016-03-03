package com.github.vlsidlyarevich.jsfspringhelloworld.beans;

import com.github.vlsidlyarevich.jsfspringhelloworld.core.MessageService;

/**
 * Created by Администратор on 03.03.2016.
 */
public class MessageServiceIMPL implements MessageService {

    private String message;

    public String getHelloWorldMessage(){
        return message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
