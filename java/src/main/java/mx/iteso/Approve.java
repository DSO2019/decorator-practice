package mx.iteso;

/**
 * Class to approve permission.
 */
public class Approve extends Privilege {
    /**
     * adds user to test.
     */
    private User user;

    /**
     *
     * @param us adds the user using the permissions.
     */
    public Approve(final User us) {
        this.user = us;
    }

    /**
     *
     *  @return user description.
     */
    public String getDescripcion() {
        return user.getDescripcion() + "can approve";
    }

    /**
     *
     * @return approve permissions, in this case must be true.
     */
    @Override
    public boolean canApprove() {
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

}
