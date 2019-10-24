package mx.iteso;

public class Admin extends User {
    //Can do anything
    /**
     * Para instanciar Admin.
     */
    public Admin{
        userTypeName = "Admin";
    }

    /***
     * Va por los nombres de los privilegios.
     * @return String de privilegios que tiene
     */
    @Override
    public String getPriviledges() {
        return super.getPriviledges();
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
        return super.publisherPriviledgeUser();
    }
}
