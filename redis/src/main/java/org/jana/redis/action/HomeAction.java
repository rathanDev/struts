package org.jana.redis.action;

public class HomeAction {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String execute() throws Exception {
        System.out.println("Hello from execute");
        return "success";
    }

}
