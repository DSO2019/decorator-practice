package mx.iteso.privileges;

import mx.iteso.Privilege;
import mx.iteso.User;

public class Delete extends Privilege{

    User user;

    public Delete(User user){
        this.user = user;
    }

    @Override
    public String getDescription() {
        return user.getDescription() + "permiso de eliminar";
    }

    public boolean canPublish(){
        return user.canPublish();
    }

    public boolean canComment(){
        return user.canComment();
    }

    public boolean canApprove(){
        return user.canApprove();
    }

    public boolean canDelete(){
        return true;
    }
}