package mx.iteso.Priviledges;

import mx.iteso.Priviledge;
import mx.iteso.User;

/**
 * Clase para poder borrar cosas.
 */
public class DeletingPriviledge extends Priviledge {
    /**
     * Se implementa usuario.
     */
    private User user;

    /**
     * getter.
     * @return user
     */
    public User getUser() {
        return user;
    }

    /**
     * Se hace link de Approving con usuario implementado.
     * @param var usuario
     */
    public DeletingPriviledge(final User var) {
        this.user = var;
    }

    /**
     * Para implementar decoration.
     *
     * @return String con lo que si puede hacer
     */
    public String getPriviledges() {
        return user.getPriviledges() + " privilegio de eliminar";
    }

    /**
     * Usuarios al no tiene privilegio de approving.
     *
     * @return string hasta que se modifique
     */
    @Override
    public String approvingPriviledgeUser() {
        return user.approvingPriviledgeUser();
    }

    /**
     * Usuarios al no tiene privilegio de commenting.
     *
     * @return string hasta que se modifique
     */
    @Override
    public String commentingPriviledgeUser() {
        return user.commentingPriviledgeUser();
    }

    /**
     * Usuarios al no tiene privilegio de deleting.
     *
     * @return string hasta que se modifique
     */
    @Override
    public String deletingPriviledgeUser() {
        return "Ya puedes eliminar";
    }

    /**
     * Usuarios al no tiene privilegio de publish.
     *
     * @return string hasta que se modifique
     */
    @Override
    public String publisherPriviledgeUser() {
        return user.publisherPriviledgeUser();
    }
}
