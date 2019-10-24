package mx.iteso.privileges;

import mx.iteso.Privilege;
import mx.iteso.User;

public class Publish extends Privilege {
    User user;

    public Publish (User user){
        this.user = user;
    }

    public String approve() {
        return this.user.approve();
    }

    public String comment() {
        return this.user.comment();
    }

    public String delete() {
        return this.user.delete();
    }

    public String publish() {
        return this.user.publish="Publicar";
    }
}
