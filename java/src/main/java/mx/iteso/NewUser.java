package mx.iteso;
/**
 * new user.
 */
public class NewUser extends User {

    /**
     * new user.
     */
    public NewUser() {
        setDescription("Este es un nuevo usuario y tiene permiso para ");
    }

    /**
     * habilidad de publicar pero sin permisos asignados.
     */
    @Override
    public boolean canPublish() {
        return false;
    }
    /**
     * habilidad de comentar pero sin permisos asignados.
     */
    @Override
    public boolean canComment() {
        return false;
    }
    /**
     * habilidad de aprobar pero sin permisos asignados.
     */
    @Override
    public boolean canApprove() {
        return false;
    }
    /**
     * habilidad de eliminar pero sin permisos asignados.
     */
    @Override
    public boolean canDelete() {
        return false;
    }
}
