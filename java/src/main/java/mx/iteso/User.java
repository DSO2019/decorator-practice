package mx.iteso;

/**
 * abstract class that ease the user creation and testing.
 */


public abstract class User {
    /**
     * basic user description.
     */
    private String descripcion = "Usuario";


    /**
     *
     * @return user description.
     */
    public String  getDescripcion() {
        return descripcion;
    }

    /**
     *
     * @param descripcion sets user description based on its permits.
     */
    public void setDescripcion(final String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     *
     * @return publish permissions. Will be overrided.
     */
    public abstract boolean canPublish();

    /**
     *
     * @return comment permissions. Will be overrided.
     */
    public abstract boolean canComment();

    /**
     *
     * @return delete permissions. Will be overrided.
     */
    public abstract boolean canDelete();

    /**
     *
     * @return approve permissions. Will be overrided.
     */
    public abstract boolean canApprove();

}

