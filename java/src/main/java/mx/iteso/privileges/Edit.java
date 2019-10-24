package mx.iteso.privileges;

import mx.iteso.PrivilegeDecorator;
import mx.iteso.User;

import java.util.Set;

public class Edit extends PrivilegeDecorator {
    private User user;

    public Edit(User user) {
        this.user = user;
        this.user.getPrivileges().add("edit");
    }

    public Set<String> getPrivileges() {
        return user.getPrivileges();
    }

    public boolean publish() {
        return user.publish();
    }

    public boolean edit() {
        return user.getPrivileges().contains("edit");
    }

    public boolean delete() {
        return user.delete();
    }

    public boolean approve() {
        return user.approve();
    }
}
