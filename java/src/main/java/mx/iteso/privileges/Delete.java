package mx.iteso.privileges;

import mx.iteso.PrivilegeDecorator;
import mx.iteso.User;

/**
 * Delete class.
 */
public class Delete extends PrivilegeDecorator {

    /**
     * User.
     */
    private final User user;

    /**
     * Constructor.
     *
     * @param user user.
     */
    public Delete(final User user) {
        this.user = user;
    }

    /**
     * Get Description.
     *
     * @return String.
     */
    @Override
    public String getDescription() {
        return "Delete permission to: " + user.getDescription();
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
        System.out.println("Delete permission added");
        return true;
    }

    /**
     * Approve permission.
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
