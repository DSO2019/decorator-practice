package mx.iteso.Priviledges;

import mx.iteso.Priviledge;
import mx.iteso.User;

public class CommentingPriviledge extends Priviledge {
    /**
     * Se implementa usuario.
     */
    User user;

    /**
     * Se hace link de Approving con usuario implementado.
     * @param user
     */
    public CommentingPriviledge(User user){
        this.user = user;
    }

    /**
     * Para implementar decoration.
     *
     * @return String con lo que si puede hacer
     */
    public String getPriviledges() {
        return user.getPriviledges() + " privilegio de comentar";
    }

    /**
     * Usuarios al no tiene privilegio de approving.
     *
     * @return string hasta que se modifique
     */
    @Override
    public String approvingPriviledgeUser() {
        return super.approvingPriviledgeUser();
    }

    /**
     * Usuarios al no tiene privilegio de commenting.
     *
     * @return string hasta que se modifique
     */
    @Override
    public String commentingPriviledgeUser() {
        return user.getPriviledges() + " ya puedes comentar";
    }

    /**
     * Usuarios al no tiene privilegio de deleting.
     *
     * @return string hasta que se modifique
     */
    @Override
    public String deletingPriviledgeUser() {
        return super.deletingPriviledgeUser();
    }

    /**
     * Usuarios al no tiene privilegio de publish.
     *
     * @return string hasta que se modifique
     */
    @Override
    public String publisherPriviledgeUser() {
        return super.publisherPriviledgeUser();
    }
}
