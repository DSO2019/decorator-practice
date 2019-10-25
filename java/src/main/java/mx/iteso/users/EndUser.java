package mx.iteso.users;

import mx.iteso.User;

public class EndUser extends User {
    public EndUser(String name) {
        this.name = name;
        this.deletePermission = "can't delete";
        this.publishPermission = "can't publish";
        this.approvePermission = "can't approve";
        this.commentPermission = "can't comment";
    }

    public String delete() {
        return this.deletePermission;
    }

    public String publish() {
        return this.publishPermission;
    }

    public String approve() {
        return this.approvePermission;
    }

    public String comment() {
        return this.commentPermission;
    }
}
