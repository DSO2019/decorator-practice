package mx.iteso;

public class Publish extends PrivilegesDecorator {
    User user;

    public Publish (User userIn) {
        this.user = userIn;
    }

    public String publish() {
        return "Puedo publicar";
    }

    public String delete() {
        return null;
    }

    public String approve() {
        return null;
    }

    public String comment() {
        return null;
    }
}
