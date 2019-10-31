package mx.iteso.privileges;

import mx.iteso.Privilege;
import mx.iteso.User;

/**
 * Privilege to publish.
 */
public class Publish extends Privilege {
    /**
     * New user to add privilege.
     */
    private User user;

    /**
     *
     * @param use to add parameters.
     */
    public Publish(final User use) {
        this.user = use;
    }

    /**
     *
     * @return publish description.
     */
    @Override
    public String getDescription() {
        return user.getDescription() + "permiso de publicar";
    }

    /**
     *
     * @return publish.
     */
    public boolean canPublish() {
        return true;
    }
    /**
     *
     * @return comment description.
     */
    public boolean canComment() {
        return user.canComment();
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
        return user.canDelete();
    }
}
