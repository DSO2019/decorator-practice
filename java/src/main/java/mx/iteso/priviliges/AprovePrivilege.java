package mx.iteso;

/**
 * Clase de privilegio.
 */
public class AprovePrivilege extends PrivilegeDecorator {
    /**
     * Variable de usuario.
     */
    private User user;

    /**
     * Creación del privilegio.
     * @param newuser usuario.
     */
    public AprovePrivilege(final User newuser) {
        this.user = newuser;
    }

    @Override
    public final String getPrivilege() {
        return this.user.getUsername() + " puede aprobar";
    }

    @Override
    public static boolean aprove() {
        System.out.print("Aprobación hecha");
        return true;
    }

    @Override
    public static boolean comment() {
        return this.user.comment();

    }


    @Override
    public static boolean delete() {
        return this.user.delete();

    }

    @Override
    public static boolean publish() {
        return this.user.publish();

    }

}
