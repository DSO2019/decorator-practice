package mx.iteso;
/**
 * Clase Approver, crea un Usuario con permiso para aprobar.
 */
public class Approver extends PrivilegeDecorator {
    /**Variable que guarda el usuario. */
    private User user;
    /**Constructor de la clase Approver.
     * @param user2 Usuario recibido para decorarlo.
     */
    public Approver(final User user2) {
        this.user = user2;
    }
    /**
     * Regresa la descripción.
     * @return Descripción, variable de clase padre.
     */
    @Override
    public String getDescription() {
        return this.user.getDescription() + " Can approve";
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
     * @return Permiso para aprobar (true).
     */
    @Override
    public boolean approve() {
        return true;
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
