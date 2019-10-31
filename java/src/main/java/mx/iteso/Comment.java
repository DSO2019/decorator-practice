package mx.iteso;

/**
 * Class to comment permission.
 */

public class Comment extends Privilege {
    /**
     * adds user to test.
     */
    private User user;

    /**
     *
     * @param us adds the user using the permissions.
     */
    public Comment(final User us) {
        this.user = us;
    }

    /**
     *
     * @return user description.
     */
    @Override
    public String getDescripcion() {
        return user.getDescripcion() + "can comment";
    }

    /**
     *
     * @return comment permissions, in this clase must be true.
     */
    @Override
    public boolean canComment() {
        return true;
    }

    /**
     *
     * @return publish permissions.
     */
    @Override
    public boolean canPublish() {
        return user.canPublish();
    }

    /**
     *
     * @return delete permissions.
     */
    @Override
    public boolean canDelete() {
        return user.canDelete();
    }

    /**
     *
     * @return approve permissions.
     */
    @Override
    public boolean canApprove() {
        return user.canApprove();
    }
}
