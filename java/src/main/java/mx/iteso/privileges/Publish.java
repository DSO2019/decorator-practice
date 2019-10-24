package mx.iteso.privileges;

import mx.iteso.PrivilegeDecorator;
import mx.iteso.User;

public class Publish extends PrivilegeDecorator {
    User user;
    String privilege = "can publish";
    public Publish(User user) {
        this.user = user;
    }

    @Override
    public String delete (){
        return this.user.delete();
    }

    @Override
    public String approve() {
        return this.user.approve();
    }

    @Override
    public String comment() {
        return this.user.comment();
    }

    @Override
    public String publish() {
        this.user.canPublish = true;
        return this.privilege;
    }
}
