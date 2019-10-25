
package mx.iteso.privileges;

import mx.iteso.PrivilegeDecorator;
import mx.iteso.User;

/**
 * Approve decoration class.
 */
public class Approve extends PrivilegeDecorator {
    /**
     * User.
     */
    private User user;

    /**
     * Constructor.
     * @param usr user.
     */
    public Approve(final User usr) {
        this.user = usr;
    }

    /**
     * Get Description method.
     * @return description.
     */
    @Override
    public String getDescription() {
        return user.getDescription() + "approve ";
    }

    /**
     * Can publish method.
     * @return can publish.
     */
    @Override
    public boolean canPublish() {
        return user.canPublish();
    }

    /**
     * Can comment method.
     * @return can comment.
     */
    @Override
    public boolean canComment() {
        return user.canComment();
    }

    /**
     * Can approve method.
     * @return can approve.
     */
    @Override
    public boolean canApprove() {
        return true;
    }

    /**
     * Can delete method.
     * @return can delete.
     */
    @Override
    public boolean canDelete() {
        return user.canDelete();
    }
}
