package mx.iteso;

public class usuarioFinal extends User{
    /***
     * Va por los nombres de los privilegios.
     * @return String de privilegios que tiene
     */
    @Override
    public String getPriviledges() {
        return "No tienes privilegios";
    }

    /**
     * Usuarios al no tiene privilegio de approving.
     *
     * @return string hasta que se modifique
     */
    @Override
    public String approvingPriviledgeUser() {
        return "no tienes privilegio de aprovar";
    }

    /**
     * Usuarios al no tiene privilegio de commenting.
     *
     * @return string hasta que se modifique
     */
    @Override
    public String commentingPriviledgeUser() {
        return "no tienes privilegio de comentar";
    }

    /**
     * Usuarios al no tiene privilegio de deleting.
     *
     * @return string hasta que se modifique
     */
    @Override
    public String deletingPriviledgeUser() {
        return "no tienes privilegio de borrar";
    }

    /**
     * Usuarios al no tiene privilegio de publish.
     *
     * @return string hasta que se modifique
     */
    @Override
    public String publisherPriviledgeUser() {
        return "no tienes privilegio de publicar";
    }
}
