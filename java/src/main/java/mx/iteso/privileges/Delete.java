
package mx.iteso.privileges;

import mx.iteso.PrivilegeDecorator;
import mx.iteso.User;

/**
 * Delete decoration class.
 */
public class Delete extends PrivilegeDecorator {
    /**
     * User.
     */
    private User user;

    /**
     * Constructor.
     * @param usr user.
     */
    public Delete(final User usr) {
        this.user = usr;
    }

    /**
     * Get Description method.
     * @return description.
     */
    @Override
    public String getDescription() {
        return user.getDescription() + "delete ";
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
        return user.canApprove();
    }

    /**
     * Can delete method.
     * @return can delete.
     */
    @Override
    public boolean canDelete() {
        return true;
    }
}
