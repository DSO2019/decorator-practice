package mx.iteso.privileges;

import mx.iteso.*;

public class Delete extends PrivilegesDecorator {

    User user;

    public Delete(User _user) {
        this.user = _user;
    }
    
    @Override
    public String getDescription() {
        return user.getDescription() + "Con permiso para borrar\n";
    }
}