package mx.iteso.privileges;

import mx.iteso.*;

public class Delete extends PrivilegesDecorator {

    User user;

    public Delete(User _user) {
        this.user = _user;
    }
    
    public void delete() {
        this.delete = "Con permiso de borrar";
    }
    
    public String print() {
        return null;
    }

    

}