
package mx.iteso.privileges;

import mx.iteso.PrivilegeDecorator;
import mx.iteso.User;

public class Comment extends PrivilegeDecorator {
    User user;

    public Comment (User user){
        this.user = user;
    }

    @Override
    public String getDescription() {
        return user.getDescription() + "comment ";
    }

    @Override
    public boolean canPublish() {
        return user.canPublish();
    }

    @Override
    public boolean canComment() {
        return true;
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