package mx.iteso.Priviledge;

import mx.iteso.PriviledgeDecorator;
import mx.iteso.User;

public class Delete extends PriviledgeDecorator {
    User user;

    public Delete (User user){
        this.user = user;
    }

    @Override
    public String getDescription() {
        return user.getDescription() + " can delete";
    }
}
