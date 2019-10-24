package mx.iteso.privileges;

import mx.iteso.PrivilegeDecorator;
import mx.iteso.User;

import java.util.Set;

public class Delete extends PrivilegeDecorator {

    private User user;

    public Delete(User user) {
        this.user = user;
        this.user.getPrivileges().add("delete");
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
        return user.getPrivileges().contains("delete");
    }

    public boolean approve() {
        return user.approve();
    }
}
