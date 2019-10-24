package mx.iteso.privileges;

import mx.iteso.*;

public class Publish extends PrivilegesDecorator {

    User user;

    public Publish(User _user) {
        this.user = _user;
    }
    
    public void publish() {
        this.publish = "Con permiso de publicar";
    }

    public String print(){
        return null; 
    }

}