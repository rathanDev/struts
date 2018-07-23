package org.jana.action;

public class HomeAction {

    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String execute() {
        return "SUCCESS";
    }

}
