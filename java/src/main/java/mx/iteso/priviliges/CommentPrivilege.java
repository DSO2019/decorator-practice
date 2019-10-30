package mx.iteso;

/**
 * Clase de privilegio.
 */
public class CommentPrivilege extends PrivilegeDecorator {
    /**
     * Variable de usuario.
     */
    private User user;

    /**
     * Creación del privilegio.
     * @param newuser usuario.
     */
    public CommentPrivilege(final User newuser) {
        this.user = newuser;
    }

    @Override
    public final String getPrivilege() {
        return this.user.getUsername() + " puede comentar";
    }

    @Override
    public static boolean comment() {
        System.out.print("Comentario hecho");
        return true;
    }

    @Override
    public static boolean aprove() {
        return this.user.aprove();

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
