package mx.iteso;

public class Approve extends PrivilegesDecorator {
    User user;

    public Approve (User userIn) {
        this.user = userIn;
    }
    public String publish() {
        return user.publish();
    }

    public String delete() {
        return user.delete();
    }

    public String approve() {
        return "Puedo aprobar";
    }

    public String comment() {
        return user.comment();
    }
}
