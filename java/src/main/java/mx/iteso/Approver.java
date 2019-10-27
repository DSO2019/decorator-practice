package mx.iteso;

import mx.iteso.PrivilegeDecorator;
import mx.iteso.User;

public class Approver extends PrivilegeDecorator {
    private User user;

    public Approver(User user) {
        this.user = user;
    }

    @Override
    public String getDescription() {
        return this.user.getDescription() + " Can approve";
    }

    @Override
    public boolean publish() {
        return this.user.publish();
    }

    @Override
    public boolean delete() {
        return this.user.delete();
    }

    @Override
    public boolean approve() {
        return true;
    }

    @Override
    public boolean comment() {
        return this.user.comment();
    }
}
