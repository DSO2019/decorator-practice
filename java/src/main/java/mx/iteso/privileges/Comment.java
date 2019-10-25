package mx.iteso.privileges;

import mx.iteso.*;

public class Comment extends PrivilegesDecorator {

    User user;

    public Comment(User _user) {
        this.user = _user;
    }

    @Override
    public String getDescription() {
        return user.getDescription() + "Con permiso para comentar\n";
    }

}