
package mx.iteso.privileges;

import mx.iteso.PrivilegeDecorator;
import mx.iteso.User;

public class Delete extends PrivilegeDecorator {
    User user;

    public Delete (User user){
        this.user = user;
    }

    @Override
    public String getDescription() {
        return user.getDescription() + "delete ";
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
        return user.canApprove();
    }

    @Override
    public boolean canDelete() {
        return true;
    }
}