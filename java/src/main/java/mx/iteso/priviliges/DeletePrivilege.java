package mx.iteso;

/**
 * Clase de privilegio.
 */
public class DeletePrivilege extends PrivilegeDecorator {
    /**
     * Variable de usuario.
     */
    private User user;

    /**
     * Creación del privilegio.
     * @param newuser usuario.
     */
    public DeletePrivilege(final User newuser) {
        this.user = newuser;
    }

    @Override
    public final String getPrivilege() {
        return this.user.getUsername() + " puede borrar";
    }


    @Override
    public static boolean delete() {
        System.out.print("Eliminación hecha");
        return true;
    }

    @Override
    public static boolean aprove() {
        return this.user.aprove();

    }

    @Override
    public static boolean comment() {
        return this.user.comment();

    }

    @Override
    public static boolean publish() {
        return this.user.publish();

    }

}
