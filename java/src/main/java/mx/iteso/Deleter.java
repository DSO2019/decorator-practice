package mx.iteso;

import mx.iteso.PrivilegeDecorator;
import mx.iteso.User;

public class Deleter extends PrivilegeDecorator {
    private User user;

    public Deleter(User user) {
        this.user = user;
    }

    @Override
    public String getDescription() {
        return this.user.getDescription() + " Can delete";
    }

    @Override
    public boolean publish() {
        return this.user.publish();
    }

    @Override
    public boolean delete() {
        return true;
    }

    @Override
    public boolean approve() {
        return this.user.approve();
    }

    @Override
    public boolean comment() {
        return this.user.comment();
    }
}
