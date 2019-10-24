package mx.iteso.privileges;

import mx.iteso.PrivilegeDecorator;
import mx.iteso.User;

import java.util.Set;

public class Approve extends PrivilegeDecorator {
    private User user;
    public  Approve(User user) {
        this.user = user;
        user.getPrivileges().add("approve");
    }
    public Set<String> getPrivileges() {
        return user.getPrivileges();
    }

    public boolean publish() {
        return user.publish();
    }

    public boolean edit() {
        return user.edit();
    }

    public boolean delete() {
        return user.delete();
    }

    public boolean approve() {
        return user.approve();
    }
}
