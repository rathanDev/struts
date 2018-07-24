package org.jana.action;

import com.opensymphony.xwork2.ActionSupport;
import org.jana.model.Person;

public class RegisterAction extends ActionSupport {

    private static final long serialVersionUID = 1L;

    private Person person;

    public String execute() throws Exception {
        System.out.println("RegisterAction execute " + person);
        return SUCCESS;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
