package mx.iteso.privileges;

import mx.iteso.PrivilegeDecorator;
import mx.iteso.User;

/**
 * Class Approve.
 */
public class Approve extends PrivilegeDecorator {
    /**
     * User.
     */
    private final User user;

    /**
     * Constructor.
     *
     * @param user user.
     */
    public Approve(final User user) {
        this.user = user;
    }

    /**
     * Get Description.
     *
     * @return String.
     */
    @Override
    public String getDescription() {
        return "Approve permission to: " + user.getDescription();
    }

    /**
     * Publish Permission.
     *
     * @return boolean.
     */
    public boolean publishPermission() {
        return user.publishPermission();
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
        System.out.println("Approve permission added");
        return true;
    }

    /**
     * Comment permission.
     *
     * @return boolean.
     */
    public boolean commentPermission() {
        return user.commentPermission();
    }
}
