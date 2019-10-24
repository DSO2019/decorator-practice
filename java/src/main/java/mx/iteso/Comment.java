package mx.iteso;

public class Comment extends PrivilegesDecorator {
    User user;

    public Comment (User userIn) {
        this.user = userIn;
    }

    public String publish() {
        return null;
    }

    public String delete() {
        return null;
    }

    public String approve() {
        return null;
    }

    public String comment() {
        return "Puedo comentar";
    }
}
