package mx.iteso.complements;

import mx.iteso.User;

/**
 * Si el usuario es admin tiene permiso para autorizar o borrar comentarios.
 */
public class Admin extends User {
    /**
     * El usuario que vamos a complementar.
     */
    private User usuario;

    /**
     * Metodo.
     * @param user El usuario que vamos a complementar.
     */
    public Admin(final User user) {
        this.usuario = user;
    }
    /**
     * Metodo.
     * @return Si el usuario puede, o no, publicar.
     */
    public final boolean publish() {
        return usuario.publish();
    }

    /**
     * Metodo.
     * @return Si el usuario puede, o no, borrar comentarios.
     */
    public final boolean delete() {
        return true;
    }

    /**
     * Metodo.
     * @return Si el usuario puede, o no, aprobar comentarios.
     */
    public final boolean approve() {
        return true;
    }

    /**
     * Metodo.
     * @return Si el usuario puede, o no, comentar.
     */
    public final boolean comment() {
        return usuario.comment();
    }
}
