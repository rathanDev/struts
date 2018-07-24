package org.jana.action;

import com.opensymphony.xwork2.ActionSupport;
import org.jana.model.MessageStore;

public class MessageAction extends ActionSupport {

    private MessageStore messageStore;

    public String execute() {
        System.out.println("MessageAction is executed");
        this.messageStore = new MessageStore();
        return SUCCESS;
    }

    public MessageStore getMessageStore() {
        return messageStore;
    }

}
