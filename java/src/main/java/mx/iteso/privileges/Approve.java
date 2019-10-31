package mx.iteso.privileges;

import mx.iteso.Privilege;
import mx.iteso.User;

public class Approve extends Privilege {
    /** @param User with approve privileges. */
    private User user;

    /** @param userIn with approve privileges  */
    public Approve(final User userIn) {
        this.user = userIn;
    }

    /**  @return New User with approve privileges. */
    public final String approve() {
        return " Can Approve";
    }

    /** @return New User with approve privileges.  */
    public final String comment() {
        return this.user.comment();
    }

    /** @return New User with approve privileges. */
    public final String delete() {
        return this.user.delete();
    }

    /** @return New User with approve privileges. */
    public final String publish() {
        return this.user.publish();
    }
}
