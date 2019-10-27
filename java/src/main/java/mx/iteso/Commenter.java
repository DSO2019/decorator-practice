package mx.iteso;

/**
 * Clase Commenter, crea un Usuario con permiso para comentar.
 */
public class Commenter extends PrivilegeDecorator {
    /** Variable que guarda el usuario. */
    private User user;

    /**
     * Constructor de la clase Commenter.
     * @param user2 Usuario recibido para decorarlo.
     */
    public Commenter(final User user2) {
        this.user = user2;
    }
    /**
     * Regresa la descripción.
     * @return Descripción, variable de clase padre.
     */
    @Override
    public String getDescription() {
        return this.user.getDescription() + " Can comment";
    }
    /**
     * Regresa el permiso para publicar.
     * @return Permiso para publicar.
     */
    @Override
    public boolean publish() {
        return this.user.publish();
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
     * @return Permiso para comentar (true).
     */
    @Override
    public boolean comment() {
        return true;
    }
}
