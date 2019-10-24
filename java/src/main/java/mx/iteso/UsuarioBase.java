package mx.iteso;

/**
 * Usuario base.
 */
public class UsuarioBase extends User {
    /**
     * Metodo.
     * @return Si el usuario puede, o no, publicar
     */
    public final boolean publish() {
        return false;
    }

    /**
     * Metodo.
     * @return Si el usuario puede, o no, borrar comentarios
     */
    public final boolean delete() {
        return false;
    }

    /**
     * Metodo.
     * @return Si el usuario puede, o no, aprobar comentarios
     */
    public final boolean approve() {
        return false;
    }

    /**
     * Metodo.
     * @return Si el usuario puede, o no, comentar
     */
    public final boolean comment() {
        return false;
    }

}
