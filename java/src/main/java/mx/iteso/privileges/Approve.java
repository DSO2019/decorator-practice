package mx.iteso.privileges;

import mx.iteso.*;

public class Approve extends PrivilegesDecorator {

    User user;

    public Approve(User _user) {
        this.user = _user;
    }

    @Override
    public String getDescription() {
        return user.getDescription() + "Con permiso para aprovar\n";
    }
}