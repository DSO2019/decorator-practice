package mx.iteso.Priviledge;

import mx.iteso.PriviledgeDecorator;
import mx.iteso.User;

public class Approve extends PriviledgeDecorator {
    User user;

    public Approve (User user){
        this.user = user;
    }

    @Override
    public String getDescription() {
        return user.getDescription() + " puede aprobar";
    }

}
