package org.jana.action;

import com.opensymphony.xwork2.ActionSupport;
import org.jana.model.MessageStore;

public class MessageAction extends ActionSupport {

    private static int messagedCount = 0;
    private MessageStore messageStore;

    public String execute() {
        System.out.println("MessageAction is executed, count:" + getMessagedCount());
        this.messageStore = new MessageStore();
        messagedCount++;
        return SUCCESS;
    }

    public static int getMessagedCount() {
        return messagedCount;
    }

    public MessageStore getMessageStore() {
        return messageStore;
    }

}
