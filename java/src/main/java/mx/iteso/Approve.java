package mx.iteso;

public class Approve extends PrivilegesDecorator {
    User user;

    public Approve (User userIn) {
        this.user = userIn;
    }
    public String publish() {
        return null;
    }

    public String delete() {
        return null;
    }

    public String approve() {
        return "Puedo aprobar";
    }

    public String comment() {
        return null;
    }
}
