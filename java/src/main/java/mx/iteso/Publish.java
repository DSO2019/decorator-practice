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
        return user.delete();
    }

    public String approve() {
        return user.approve();
    }

    public String comment() {
        return user.comment();
    }
}
