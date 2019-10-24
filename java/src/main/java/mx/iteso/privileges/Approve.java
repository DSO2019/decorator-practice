package mx.iteso.privileges;

import mx.iteso.PrivilegeDecorator;
import mx.iteso.User;

public class Approve extends PrivilegeDecorator {
    User user;
    String privilege = "can approve";
    public Approve(User user) {
        this.user = user;
    }

    @Override
    public String delete (){
        return this.user.delete();
    }

    @Override
    public String approve() {
        this.user.canApprove = true;
        return this.privilege;
    }

    @Override
    public String comment() {
        return this.user.comment();
    }

    @Override
    public String publish() {
        return this.user.publish();
    }
}
