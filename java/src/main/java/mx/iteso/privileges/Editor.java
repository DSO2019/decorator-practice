package mx.iteso.privileges;

import mx.iteso.PrivilegeDecorator;
import mx.iteso.User;

public class Editor extends PrivilegeDecorator {
    private User user;

    public Editor(User user) {
        this.user = user;
    }

    @Override
    public String getDescription() {
         return this.user.getDescription() + " Can edit";
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
    public boolean edit() {
        return true;
    }
}
