
package mx.iteso.privileges;

import mx.iteso.PrivilegeDecorator;
import mx.iteso.User;

public class Publish extends PrivilegeDecorator {
    User user;

    public Publish (User user){
        this.user = user;
    }

    @Override
    public String getDescription() {
        return user.getDescription() + "publish ";
    }

    @Override
    public boolean canPublish() {
        return true;
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
        return user.canDelete();
    }
}