package mx.iteso;

/**
 * User Abstract Class.
 */
public abstract class User {

    /**
     * Variable description
     */
    private String description = "Current user";

    /**
     * Obtener description.
     *
     * @return String description.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Permisos de publicar.
     *
     * @return boolean.
     */
    public abstract boolean publishPermission();

    /**
     * Permisos borrar.
     *
     * @return boolean.
     */
    public abstract boolean deletePermission();

    /**
     * Permisos aprovar.
     *
     * @return boolean.
     */
    public abstract boolean approvePermission();

    /**
     * Permisos comentar.
     *
     * @return boolean.
     */
    public abstract boolean commentPermission();
}
