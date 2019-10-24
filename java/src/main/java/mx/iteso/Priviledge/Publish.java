package mx.iteso.Priviledge;

import mx.iteso.PriviledgeDecorator;
import mx.iteso.User;

public class Publish extends PriviledgeDecorator {
    User user;

    public Publish (User user){
        this.user = user;
    }

    @Override
    public String getDescription() {
        return user.getDescription() + " can publish";
    }
}
