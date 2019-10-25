package mx.iteso;

public abstract class User {
    /**
     * Inicializar variable del nombre de los privilegios.
     */
    public String privilegio = "Tienes el privilegio de : ";
    /**
     * Nombre de tipo de poderes
     */
    public String userTypeName = "";

    /***
     * Va por los nombres de los privilegios.
     * @return String de privilegios que tiene
     */
    public String getPriviledges() {
        return privilegio;
    };
    /**
     * Usuarios al no tiene privilegio de approving.
     * @return string hasta que se modifique
     */
    public String approvingPriviledgeUser(){
        return null;
    }

    /**
     * Usuarios al no tiene privilegio de commenting.
     * @return string hasta que se modifique
     */
    public String commentingPriviledgeUser(){
        return null;
    }

    /**
     * Usuarios al no tiene privilegio de deleting.
     * @return string hasta que se modifique
     */
    public String deletingPriviledgeUser(){
        return null;
    }

    /**
     * Usuarios al no tiene privilegio de publish.
     * @return string hasta que se modifique
     */
    public String publisherPriviledgeUser(){
        return null;
    }
}
