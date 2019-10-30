package mx.iteso.privileges;

import mx.iteso.PrivilegeDecorator;
import mx.iteso.User;

/**
 * Publish class.
 */
public class Publish extends PrivilegeDecorator {

    /**
     * User.
     */
    private final User user;

    /**
     * Constructor.
     *
     * @param user the user.
     */
    public Publish(final User user) {
        this.user = user;
    }

    /**
     * Get Description.
     *
     * @return Description.
     */
    @Override
    public String getDescription() {
        return "Publish: " + user.getDescription();
    }

    /**
     * Publish Permission.
     *
     * @return boolean.
     */
    public boolean publishPermission() {
        System.out.println("Publish permission added");
        return true;
    }

    /**
     * Delete Permission.
     *
     * @return boolean.
     */
    public boolean deletePermission() {
        return user.deletePermission();
    }

    /**
     * Approve Permission.
     *
     * @return boolean.
     */
    public boolean approvePermission() {
        return user.approvePermission();
    }

    /**
     * Comment Permission.
     *
     * @return boolean.
     */
    public boolean commentPermission() {
        return user.commentPermission();
    }
}
