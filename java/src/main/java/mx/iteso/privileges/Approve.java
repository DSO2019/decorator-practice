package mx.iteso.privileges;

import mx.iteso.*;

public class Approve extends PrivilegesDecorator {

    User user;

    public Approve(User _user) {
        this.user = _user;
    }
    
    public void approve() {
        this.approve = "Con permiso de aprobar";
    }

    public String print(){
        return null; 
    }

}