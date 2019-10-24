package mx.iteso.Priviledge;

import mx.iteso.PriviledgeDecorator;
import mx.iteso.User;

public class Comment extends PriviledgeDecorator {
    User user;

    public Comment (User user){
        this.user = user;
    }

    @Override
    public String getDescription() {
        return user.getDescription() + " can Comment";
    }
}
