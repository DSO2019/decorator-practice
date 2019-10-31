package mx.iteso;

/**
 * Class for delete permission.
 */
public class Delete extends Privilege {
    /**
     * adds user to test.
     */
    private User user;

    /**
     *
     * @param us adds the user using the permissions.
     */
    public Delete(final User us) {
        this.user = us;
    }

    /**
     *
     * @return user description.
     */
    @Override
    public String getDescripcion() {
        return user.getDescripcion() + "can delete";
    }

    /**
     *
     * @return delete permissions, in this case must be true.
     */
    @Override
    public boolean canDelete() {
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
     * @return publish permissions.
     */
    @Override
    public boolean canPublish() {
        return user.canPublish();
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
