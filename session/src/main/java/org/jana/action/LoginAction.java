package org.jana.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.SessionAware;

import java.util.Map;
import java.util.Objects;

public class LoginAction extends ActionSupport implements SessionAware {

    private String username;
    private String password;
    private Map<String, Object> userSession;

    public String execute() {
        System.out.println("LoginAction execute " + username + " " + password);
        System.out.println("session = " + this.userSession);
        if(Objects.equals(username, "u") && Objects.equals(password, "p")) {
            userSession.put("login", true);
            System.out.println("session = " + this.userSession);
            return SUCCESS;
        } else {
            return ERROR;
        }
    }
    public String logout() {
        userSession.remove("login");
        System.out.println("session = " + this.userSession);
        return SUCCESS;
    }

    @Override
    public void setSession(Map<String, Object> session) {
        System.out.println("session = " + session);
        this.userSession = userSession;
        System.out.println("session = " + this.userSession);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Map<String, Object> getUserSession() {
        return userSession;
    }

    public void setUserSession(Map<String, Object> userSession) {
        this.userSession = userSession;
    }

}
