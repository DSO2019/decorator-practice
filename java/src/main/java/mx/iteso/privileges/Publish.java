package mx.iteso.privileges;

import mx.iteso.*;

public class Publish extends PrivilegesDecorator {

    User user;

    public Publish(User _user) {
        this.user = _user;
    }

    @Override
    public String getDescription() {
        return user.getDescription() + "Con permiso para publicar\n";
    }

}