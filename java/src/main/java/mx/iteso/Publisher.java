package mx.iteso;

import mx.iteso.PrivilegeDecorator;
import mx.iteso.User;

public class Publisher extends PrivilegeDecorator {
    private User user;

    public Publisher(User user) {
        this.user = user;
    }

    @Override
    public String getDescription() {
         return this.user.getDescription() + " Can publish";
    }

    @Override
    public boolean publish() {
        return true;
    }

    @Override
    public boolean delete() {
        return this.user.delete();
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
