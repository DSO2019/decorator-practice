package mx.iteso;

/**
 * Clase de privilegio.
 */
public class PublishPrivilege extends PrivilegeDecorator {
    /**
     * Variable de usuario.
     */
    private User user;

    /**
     * Creación del privilegio.
     * @param newuser usuario.
     */
    public PublishPrivilege(final User newuser) {
        this.user = newuser;
    }

    @Override
    public final String getPrivilege() {
        return this.user.getUsername() + " puede publicar";
    }

    @Override
    public static boolean publish() {
        System.out.print("Publicación hecha");
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
    public static boolean comment() {
        return this.user.comment();

    }


}
