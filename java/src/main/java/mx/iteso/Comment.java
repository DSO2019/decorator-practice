package mx.iteso;

public class Comment extends PrivilegesDecorator {
    User user;

    public Comment (User userIn) {
        this.user = userIn;
    }

    public String publish() {
        return user.publish();
    }

    public String delete() {
        return user.delete();
    }

    public String approve() {
        return user.approve();
    }

    public String comment() {
        return "Puedo comentar";
    }
}
