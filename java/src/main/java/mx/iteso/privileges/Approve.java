package mx.iteso.privileges;

import mx.iteso.Privilege;
import mx.iteso.User;

/**
 * Approve class privilege.
 */
public class Approve extends Privilege {
    /**
     * New user to add privileges.
     */
    private User user;

    /**
     *
     * @param use to get approve privilege.
     */
    public Approve(final User use) {
        this.user = use;
    }

    /**
     *
     * @return Approve description.
     */
    @Override
    public String getDescription() {
        return user.getDescription() + "permiso de aprobar";
    }

    /**
     *
     * @return Privilege Publish.
     */
    public boolean canPublish() {
        return canPublish();
    }

    /**
     *
     * @return Privilege Commnet.
     */
    public boolean canComment() {
        return canComment();
    }

    /**
     *
     * @return Privilege Approve.
     */
    public boolean canApprove() {
        return true;
    }

    /**
     *
     * @return privilege Delete.
     */
    public boolean canDelete() {
        return user.canDelete();
    }
}
