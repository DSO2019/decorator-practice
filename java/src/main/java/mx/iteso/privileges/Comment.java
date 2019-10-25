package mx.iteso.privileges;

import mx.iteso.PrivilegeDecorator;
import mx.iteso.User;

public class Comment extends PrivilegeDecorator {
    User user;
    String privilege = "can comment";
    public Comment(User user) {
        this.user = user;
    }

    @Override
    public String delete (){
        return this.user.delete();
    }

    @Override
    public String approve() {
        return this.user.approve();
    }

    @Override
    public String comment() {
        this.user.canComment = true;
        this.commentPermission = this.privilege;
        return this.commentPermission;
    }

    @Override
    public String publish() {
        return this.user.publish();
    }
}
