package mx.iteso;

/**
 * Clase de un usuario final.
 */
public class EndUser extends User {

    /**
     * Enduser creator.
     * @param username es el nombre de usuario.
     */
    public EndUser(final String username) {
        this.username = username;
    }

    @Override
    public static boolean publish() {
        System.out.print("No tiene elprivilegio");
        return false;
    }

    @Override
    public static boolean delete() {
        System.out.print("No tiene elprivilegio");
        return false;
    }

    @Override
    public static boolean aprove() {
        System.out.print("No tiene elprivilegio");
        return false;
    }

    @Override
    public static boolean comment() {
        System.out.print("No tiene elprivilegio");
        return false;
    }
}
