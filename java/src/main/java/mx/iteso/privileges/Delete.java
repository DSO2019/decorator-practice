package mx.iteso.privileges;

import mx.iteso.PrivilegeDecorator;
import mx.iteso.User;

/**
 * Created by Maggie Jauregui on 10/25/19.
 */
public class Delete extends PrivilegeDecorator {
    /**
     * User to grant permission.
     */
    private final User user;
    /**
     * Privilege granted.
     */
    private final String privilege = "can delete";
    /**
     * Class constructor.
     * @param newUser to be set.
     */
    public Delete(final User newUser) {
        this.user = newUser;
    }

    /**
     * Getter for user.
     * @return user.
     */
    public User getUser() {
        return this.user;
    }

    /**
     * Grants delete permission to user.
     * @return delete permission.
     */
    @Override
    public String delete() {
        return this.privilege;
    }

    /**
     * Gets user's current approve permission.
     * @return approve permission.
     */
    @Override
    public String approve() {
        return this.user.approve();
    }
    /**
     * Gets user's current comment permission.
     * @return comment permission.
     */
    @Override
    public String comment() {
        return this.user.comment();
    }
    /**
     * Gets user's current publish permission.
     * @return publish permission.
     */
    @Override
    public String publish() {
        return this.user.publish();
    }
}
