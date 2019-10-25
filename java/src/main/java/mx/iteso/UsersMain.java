package mx.iteso;

import mx.iteso.Priviledges.ApprovingPriviledge;
import mx.iteso.Priviledges.CommentingPriviledge;
import mx.iteso.Priviledges.DeletingPriviledge;
import mx.iteso.Priviledges.PublishingPriviledge;

/**
 * Clase main para verificar usos correctos.
 */
public final class UsersMain {
    /**
     * Para quitar warning.
     */
    private UsersMain() {
    }
    /**
     * Iniciar el main de la aplicacion.
     * @param args hacer el main
     */
    public static void main(final String[]  args) {
        User admin = new UsuarioFinal();
        //Vamos a crear un admin, debe de tener todos los permisos.
        //Comprovamos que no tienen permisos de nada
        System.out.println(admin.approvingPriviledgeUser());
        System.out.println(admin.commentingPriviledgeUser());
        System.out.println(admin.deletingPriviledgeUser());
        System.out.println(admin.publisherPriviledgeUser());
        admin = new ApprovingPriviledge(admin);
        System.out.println("==================================== ");
        System.out.println("Ya implementamos aprovar");
        System.out.println(admin.approvingPriviledgeUser());
        System.out.println(admin.commentingPriviledgeUser());
        System.out.println(admin.deletingPriviledgeUser());
        System.out.println(admin.publisherPriviledgeUser());
        System.out.println("==================================== ");
        System.out.println("Ya implementamos todo para admin");
        admin = new CommentingPriviledge(admin);
        admin = new DeletingPriviledge(admin);
        admin = new PublishingPriviledge(admin);
        System.out.println(admin.approvingPriviledgeUser());
        System.out.println(admin.commentingPriviledgeUser());
        System.out.println(admin.deletingPriviledgeUser());
        System.out.println(admin.publisherPriviledgeUser());
    }
}
