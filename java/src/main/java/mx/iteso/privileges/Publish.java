package mx.iteso.privileges;

import mx.iteso.PrivilegeDecorator;
import mx.iteso.User;

/**
 * Created by Maggie Jauregui on 10/25/19.
 */
public class Publish extends PrivilegeDecorator {
    /**
     * User to grant permission.
     */
    private final User user;
    /**
     * Privilege granted.
     */
    private final String privilege = "can publish";
    /**
     * Class constructor.
     * @param newUser to be set.
     */
    public Publish(final User newUser) {
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
     * Gets user's current delete permission.
     * @return delete permission.
     */
    @Override
    public String delete() {
        return this.user.delete();
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
     * Gets user's current approve permission.
     * @return approve permission.
     */
    @Override
    public String comment() {
        return this.user.comment();
    }
    /**
     * Grants publish permission to user.
     * @return publish permission.
     */
    @Override
    public String publish() {
        return this.privilege;
    }
}
