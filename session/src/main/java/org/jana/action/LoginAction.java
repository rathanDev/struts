package org.jana.action;

import org.apache.struts2.interceptor.SessionAware;

import java.util.Map;

public class LoginAction implements SessionAware {

    private Map<String, Object> userSession;

    @Override
    public void setSession(Map<String, Object> session) {
        System.out.println("session = " + session);
        this.userSession = userSession;
    }

}
