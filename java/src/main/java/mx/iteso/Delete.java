package mx.iteso;

public class Delete extends PrivilegesDecorator {
    User user;

    public Delete (User userIn) {
        this.user = userIn;
    }

    public String publish() {
        return null;
    }

    public String delete() {
        return "Puedo borrar";
    }

    public String approve() {
        return null;
    }

    public String comment() {
        return null;
    }
}
