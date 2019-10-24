package mx.iteso.privileges;

import mx.iteso.Privilege;
import mx.iteso.User;

public class Comment extends Privilege {
    User user;

    public Comment (User user){
        this.user = user;
    }

    public String approve() {
        return this.user.approve();
    }

    public String comment() {
        return this.user.comment="Comentar";
    }

    public String delete() {
        return this.user.delete();
    }

    public String publish() {
        return this.user.publish();
    }
}
