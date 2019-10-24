package mx.iteso.Priviledges;

import mx.iteso.Priviledge;
import mx.iteso.User;

public class PublishingPriviledge extends Priviledge {
    /**
     * Se implementa usuario.
     */
    User user;

    /**
     * Se hace link de Approving con usuario implementado.
     * @param user
     */
    public PublishingPriviledge(User user){
        this.user = user;
    }

    /**
     * Para implementar decoration.
     *
     * @return String con lo que si puede hacer
     */
    public String getPriviledges() {
        return user.getPriviledges() + " privilegio de publicar";
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
        return super.commentingPriviledgeUser();
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
        return user.getPriviledges() + " ya puedes publicar";
    }
}

