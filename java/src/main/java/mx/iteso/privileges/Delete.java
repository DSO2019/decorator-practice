package mx.iteso.privileges;

import mx.iteso.Privilege;
import mx.iteso.User;

public class Delete extends Privilege {
    /** @param User with delete privileges. */
    private User user;

    /** @param userIn with delete privileges  */
    public Delete(final User userIn) {
        this.user = userIn;
    }

    /**  @return New User with delete privileges. */
    public final String approve() {
        return this.user.approve();
    }

    /** @return New User with delete privileges.  */
    public final String comment() {
        return this.user.comment();
    }

    /** @return New User with delete privileges. */
    public final String delete() {
        return "Can Delete"; }

    /** @return New User with delete privileges. */
    public final String publish() {
        return this.user.publish();
    }
}
