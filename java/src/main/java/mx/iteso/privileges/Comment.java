package mx.iteso.privileges;

import mx.iteso.*;

public class Comment extends PrivilegesDecorator {

    User user;

    public Comment(User _user) {
        this.user = _user;
    }
    
    public void comment() {
        this.comment = "Con permiso de comentar";
    }

    public String print(){
        return null; 
    }

}