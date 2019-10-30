package mx.iteso;
/**
 * Clase Usuario.
 */
public abstract class User {
    /**
     * Variable de nombre de usuario.
     */
    private String username = "usename";

    /**
     * Devuelve el nombre de usuario.
     * @return nombre de usuario.
     */
    public final String getUsername() {
        return username;
    }

    /**
     * Realiza una publicación.
     * @return permiso.
     */
    public abstract boolean publish();

    /**
     * Realiza eliminación.
     * @return permiso.
     */
    public abstract boolean delete();

    /**
     * Realiza una aprobación.
     * @return permiso.
     */
    public abstract boolean aprove();

     /**
      * Realiza un comentario.
      * @return permiso.
      */
    public abstract boolean comment();
}
