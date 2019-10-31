package mx.iteso;

/**
 * Created by ElMaligno666 on October 2019.
 */
public class Comment extends PrivilegesDecorator {
    /**
     * User to be decorated.
     */
    private User user;

    /**
     * @param userIn user to be decorated.
     */
    public Comment(final User userIn) {
        this.user = userIn;
    }

    /**
     * @return this user's right to publish
     */
    public String publish() {
        return user.publish();
    }

    /**
     * @return this user's right to delete
     */
    public String delete() {
        return user.delete();
    }

    /**
     * @return this user's right to approve
     */
    public String approve() {
        return user.approve();
    }

    /**
     * @return this user's right to comment
     */
    public String comment() {
        return "Puedo comentar";
    }
}
