package mx.iteso;

/**
 * Final User class.
 */
public class FinalUser extends User {

    /**
     * Constructor.
     */
    public FinalUser() {
        setDescription("User with privileges: ");
    }

    /**
     * Can publish method.
     */
    @Override
    public boolean canPublish() {
        return false;
    }

    /**
     * Can comment method.
     */
    @Override
    public boolean canComment() {
        return false;
    }

    /**
     * Can approve method.
     */
    @Override
    public boolean canApprove() {
        return false;
    }

    /**
     * Can delete method.
     */
    @Override
    public boolean canDelete() {
        return false;
    }

}
