package mx.iteso;

/**
 * Clase Publisher, crea un Usuario con permiso para publicar.
 */
public class Publisher extends PrivilegeDecorator {
    /** Variable que guarda el usuario. */
    private User user;
    /**
     * Constructor de la clase Deleter.
     * @param user2 Usuario recibido para decorarlo.
     */
    public Publisher(final User user2) {
        this.user = user2;
    }
    /**
     * Regresa la descripción.
     * @return Descripción, variable de clase padre.
     */
    @Override
    public String getDescription() {
        return this.user.getDescription() + " Can publish";
    }
    /**
     * Regresa el permiso para publicar.
     * @return Permiso para publicar (true).
     */
    @Override
    public boolean publish() {
        return true;
    }
    /**
     * Regresa el permiso para eliminar.
     * @return Permiso para eliminar.
     */
    @Override
    public boolean delete() {
        return this.user.delete();
    }
    /**
     * Regresa el permiso para aprobar.
     * @return Permiso para aprobar.
     */
    @Override
    public boolean approve() {
        return this.user.approve();
    }
    /**
     * Regresa el permiso para comentar.
     * @return Permiso para comentar.
     */
    @Override
    public boolean comment() {
        return this.user.comment();
    }
}
