package mx.iteso.privileges;

import mx.iteso.PrivilegeDecorator;
import mx.iteso.User;

import java.util.List;
import java.util.Set;

public class Publish extends PrivilegeDecorator {
    private User user;
    public Publish(User user) {
        this.user = user;
        user.getPrivileges().add("publish");
    }

    public Set<String> getPrivileges() {
        return user.getPrivileges();
    }

    public boolean publish() {
        return user.getPrivileges().contains("publish");
    }

    public boolean edit() {
        return user.delete();
    }

    public boolean delete() {
        return user.delete();
    }

    public boolean approve() {
        return user.approve();
    }
}
