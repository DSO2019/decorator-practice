package mx.iteso;

public class Delete extends PrivilegesDecorator {
    User user;

    public Delete (User userIn) {
        this.user = userIn;
    }

    public String publish() {
        return user.publish();
    }

    public String delete() {
        return "Puedo borrar";
    }

    public String approve() {
        return user.approve();
    }

    public String comment() {
        return user.comment();
    }
}
