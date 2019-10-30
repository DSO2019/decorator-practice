package mx.iteso.privileges;

import mx.iteso.PrivilegeDecorator;
import mx.iteso.User;

/**
 * class Comment.
 */
public class Comment extends PrivilegeDecorator {
    /**
     * User.
     */
    private final User user;

    /**
     * Constructor.
     *
     * @param user user.
     */
    public Comment(final User user) {
        this.user = user;
    }

    /**
     * Get Description.
     *
     * @return String.
     */
    @Override
    public String getDescription() {
        return "Comment: " + user.getDescription();
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
        return user.approvePermission();
    }

    /**
     * Comment permission.
     *
     * @return boolean.
     */
    public boolean commentPermission() {
        System.out.println("Comment permission added");
        return true;
    }
}
