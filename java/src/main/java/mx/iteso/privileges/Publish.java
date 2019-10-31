package mx.iteso.privileges;

import mx.iteso.Privilege;
import mx.iteso.User;

public class Publish extends Privilege {
    /** @param User with publish privileges. */
    private User user;

    /** @param userIn with publish privileges  */
    public Publish(final User userIn) {
        this.user = userIn;
    }

    /**  @return New User with publish privileges. */
    public final String approve() {
        return this.user.approve();
    }

    /** @return New User with publish privileges.  */
    public final String comment() {
        return this.user.comment();
    }

    /** @return New User with publish privileges. */
    public final String delete() {
        return  this.user.delete(); }

    /** @return New User with publish privileges. */
    public final String publish() {
        return " Can Publish";
    }
}
