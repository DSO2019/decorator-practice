package mx.iteso;

/**
 * extends User class to use the original abstract methods.
 */
public class FinalUser extends User {
    /**
     *  User that will be tested.
     */
    public FinalUser() {
        setDescripcion("Usuario con privilegios;");
    }

    /**
     *
     * @return publish permissions. Will be overrided if needed.
     */
    @Override
    public boolean canApprove() {
        return false;
    }

    /**
     *
     * @return publish permissions. Will be overrided if needed.
     */
    @Override
    public boolean canComment() {
        return false;
    }

    /**
     *
     * @return publish permissions. Will be overrided if needed.
     */
    @Override
    public boolean canDelete() {
        return false;
    }

    /**
     *
     * @return publish permissions. Will be overrided if needed.
     */
    @Override
    public boolean canPublish() {
        return false;
    }
}
