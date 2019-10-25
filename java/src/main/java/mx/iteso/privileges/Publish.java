
package mx.iteso.privileges;

import mx.iteso.PrivilegeDecorator;
import mx.iteso.User;

/**
 * Publish decoration class.
 */
public class Publish extends PrivilegeDecorator {
    /**
     * User.
     */
    private User user;

    /**
     * Constructor.
     * @param usr user.
     */
    public Publish(final User usr) {
        this.user = usr;
    }

    /**
     * Get Description method.
     * @return description.
     */
    @Override
    public String getDescription() {
        return user.getDescription() + "publish ";
    }

    /**
     * Can publish method.
     * @return can publish.
     */
    @Override
    public boolean canPublish() {
        return true;
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
        return user.canApprove();
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
