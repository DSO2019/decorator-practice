package mx.iteso.privileges;

import mx.iteso.Privilege;
import mx.iteso.User;

/**
 * Delete class.
 */
public class Delete extends Privilege {
    /**
     * New user to add privilege.
     */
    private User user;

    /**
     *
     * @param use to get delete privilege.
     */
    public Delete(final User use) {
        this.user = use;
    }

    /**
     *
     * @return delete description.
     */
    @Override
    public String getDescription() {
        return user.getDescription() + "permiso de comentar";
    }

    /**
     *
     * @return publish description.
     */
    public boolean canPublish() {
        return user.canPublish();
    }

    /**
     *
     * @return commnet description.
     */
    public boolean canComment() {
        return true;
    }

    /**
     *
     * @return approve description.
     */
    public boolean canApprove() {
        return user.canApprove();
    }

    /**
     *
     * @return delete description.
     */
    public boolean canDelete() {
        return true;
    }
}
