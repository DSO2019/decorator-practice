package mx.iteso.privileges;

import mx.iteso.Privilege;
import mx.iteso.User;

public class Publish extends Privilege
{
    User user;

    public Publish(User user){
        this.user = user;
    }

    @Override
    public String getDescription() {
        return user.getDescription() + "permiso de publicar";
    }

    public boolean canPublish(){
        return true;
    }

    public boolean canComment(){
        return user.canComment();
    }

    public boolean canApprove(){
        return user.canApprove();
    }

    public boolean canDelete(){
        return user.canDelete();
    }
}
