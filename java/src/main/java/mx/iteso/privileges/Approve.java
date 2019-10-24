
package mx.iteso.privileges;

import mx.iteso.PrivilegeDecorator;
import mx.iteso.User;

public class Approve extends PrivilegeDecorator {
    User user;

    public Approve (User user){
        this.user = user;
    }

    @Override
    public String getDescription() {
        return user.getDescription() + "approve ";
    }

    @Override
    public boolean canPublish() {
        return user.canPublish();
    }

    @Override
    public boolean canComment() {
        return user.canComment();
    }

    @Override
    public boolean canApprove() {
        return true;
    }

    @Override
    public boolean canDelete() {
        return user.canDelete();
    }
}