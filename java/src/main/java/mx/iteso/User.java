package mx.iteso;
/**
 * Clase abstracta User.
 */
public abstract class User {
    /**Variable descripción del usuario. */
    private String description = "User >";
    /**@return descripción del usuario. */
    public String getDescription() {
        return this.description;
    }
    /**Metodo abstracto publish.
     * @return permiso para publicar.
    */
    public abstract boolean publish();
    /**Metodo abstracto delete.
     * @return permiso para eliminar.
    */
    public abstract boolean delete();
    /**Metodo abstracto approve.
     * @return permiso para aprobar.
    */
    public abstract boolean approve();
    /**Metodo abstracto comment.
     * @return permiso para comentar.
    */
    public abstract boolean comment();
}
