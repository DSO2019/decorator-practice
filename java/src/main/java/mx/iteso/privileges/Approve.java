package mx.iteso.privileges;

import mx.iteso.Privilege;
import mx.iteso.User;

public class Approve extends Privilege {
    private User user;

    public Approve(final User user){
        this.user = user;
    }

    @Override
    public String getDescription() {
        return user.getDescription() + "permiso de aprbar";
    }

    public boolean canPublish(){
        return canPublish();
    }

    public boolean canComment(){
        return true;
    }

    public boolean canApprove(){
        return user.canApprove();
    }

    public boolean canDelete(){
        return user.canDelete();
    }
}