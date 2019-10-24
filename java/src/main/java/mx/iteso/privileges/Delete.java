package mx.iteso.privileges;

import mx.iteso.Privilege;
import mx.iteso.User;

public class Delete extends Privilege {
    User user;

    public Delete (User user){
        this.user = user;
    }

    public String approve() {
        return this.user.approve();
    }

    public String comment() {
        return this.user.comment();
    }

    public String delete() {
        return this.user.delete="Borrar";
    }

    public String publish() {
        return this.user.publish();
    }
}
