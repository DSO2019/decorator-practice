package mx.iteso.complements;

import mx.iteso.User;

/**
 * Si el usuario es publisher tiene permiso para publicar.
 */
public class Publisher extends User {
    /**
     * El usuario que vamos a complementar.
     */
    private User usuario;

    /**
     * Metodo.
     * @param user El usuario que vamos a complementar
     */
    public Publisher(final User user) {
        this.usuario = user;
    }

    /**
     * Metodo.
     * @return Si el usuario puede, o no, publicar
     */
    public final boolean publish() {
        return true;
    }

    /**
     * Metodo.
     * @return Si el usuario puede, o no, borrar comentarios
     */
    public final boolean delete() {
        return usuario.delete();
    }

    /**
     * Metodo.
     * @return Si el usuario puede, o no, aprobar comentarios
     */
    public final boolean approve() {
        return usuario.approve();
    }

    /**
     * Metodo.
     * @return Si el usuario puede, o no, comentar
     */
    public final boolean comment() {
        return usuario.comment();
    }
}
