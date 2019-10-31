package mx.iteso.privileges;
import mx.iteso.Privilege;
import mx.iteso.User;

public class Comment extends Privilege {
    /** @param User with comment privileges. */
    private User user;

    /** @param userIn with comment privileges  */
    public Comment(final User userIn) {
        this.user = userIn;
    }

    /**  @return New User with comment privileges. */
    public final String approve() {
        return this.user.comment();
    }

    /** @return New User with comment privileges.  */
    public final String comment() {
        return "Can comment";
    }

    /** @return New User with comment privileges. */
    public final String delete() {
        return this.user.delete();
    }

    /** @return New User with comment privileges. */
    public final String publish() {
        return this.user.publish();
    }
}
