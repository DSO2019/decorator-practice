package mx.iteso;

/**
 * Class for Publish permissions.
 */
public class Publish extends Privilege {
    /**
     * adds user to test.
     */
    private User user;

    /**
     *
     * @param us adds the user using the permissions.
     */
    public Publish(final User us) {
        this.user = us;
    }

    /**
     *
     * @return user description.
     */
    @Override
    public String getDescripcion() {
        return user.getDescripcion() + "can publish";
    }

    /**
     *
     * @return publish permissions.
     */
    @Override
    public boolean canPublish() {
        return true;
    }

    /**
     *
     * @return comment permissions.
     */
    @Override
    public boolean canComment() {
        return user.canComment();
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
