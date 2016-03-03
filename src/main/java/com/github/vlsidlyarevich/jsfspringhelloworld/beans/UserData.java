package com.github.vlsidlyarevich.jsfspringhelloworld.beans;


import com.github.vlsidlyarevich.jsfspringhelloworld.core.MessageService;

import javax.faces.bean.ManagedBean;
import java.io.Serializable;

@ManagedBean
public class UserData implements Serializable {

    public static final long serialVersionID=1L;

    private MessageService messageService;

    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }

    public String getHelloWorldMessage(){
        return messageService.getHelloWorldMessage();
    }
}
