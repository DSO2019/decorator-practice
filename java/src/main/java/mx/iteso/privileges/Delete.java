package mx.iteso.privileges;

import mx.iteso.PrivilegeDecorator;
import mx.iteso.User;

public class Delete extends PrivilegeDecorator {
    User user;
    String privilege = "can delete";
    public Delete(User user) {
        this.user = user;
    }
    @Override
    public String delete () {
        this.user.canDelete = true;
        this.deletePermission = this.privilege;
        return this.deletePermission;
    }

    @Override
    public String approve() {
        return this.user.approve();
    }

    @Override
    public String comment() {
        return this.user.comment();
    }

    @Override
    public String publish() {
        return this.user.publish();
    }
}
