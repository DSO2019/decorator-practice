package mx.iteso;

import mx.iteso.PrivilegeDecorator;
import mx.iteso.User;

public class Commenter extends PrivilegeDecorator {
    private User user;

    public Commenter(User user) {
        this.user = user;
    }

    @Override
    public String getDescription() {
         return this.user.getDescription() + " Can comment";
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
        return this.user.approve();
    }

    @Override
    public boolean comment() {
        return true;
    }
}
