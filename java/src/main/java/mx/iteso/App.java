package mx.iteso;

import mx.iteso.privileges.Approve;
import mx.iteso.privileges.Publish;
import mx.iteso.privileges.Delete;
import mx.iteso.privileges.Comment;

/**Main.*/
final class App {

    /**Constructor.*/
    private App() {

    }

    /**
     * @param args args.
    */
    public static void main(final String[] args) {
        User admin = new FinalUser();
        admin = new Approve(admin);
        admin = new Publish(admin);
        admin = new Delete(admin);
        admin = new Comment(admin);
        System.out.println("Admin " + admin.getDescription());

        User editor = new FinalUser();
        editor = new Delete(editor);
        editor = new Comment(editor);
        System.out.println("Editor " + editor.getDescription());

        User publicador = new FinalUser();
        publicador = new Publish(publicador);
        publicador = new Delete(publicador);
        publicador = new Comment(publicador);
        System.out.println("Publicador " + publicador.getDescription());

    }
}
