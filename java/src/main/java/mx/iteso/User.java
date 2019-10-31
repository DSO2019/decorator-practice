package mx.iteso;

/**
 * User class.
 */
public abstract class User {
    /**
     *  user description.
     */
    private String description = "User";

    /**
     *
     * @return user description.
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param desc for the user.
     */
    public void setDescription(final String desc) {
        this.description = description;
    }

    /**
     *
     * @return permiso para publicar.
     */
    public abstract boolean canPublish();
    /**
     *
     * @return permiso para comentar.
     */
    public abstract boolean canComment();
    /**
     *
     * @return permiso para aprobar.
     */
    public abstract boolean canApprove();
    /**
     *
     * @return permiso para eliminar.
     */
    public abstract boolean canDelete();
}
