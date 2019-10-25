package mx.iteso;

import mx.iteso.*;
import mx.iteso.privileges.*;

public class Main{

    public static void main(String[] args) {
     
        User admin = new FinalUser();
        System.out.println();
        admin = new Approve(admin);
        admin = new Publish(admin);
        admin = new Delete(admin);
        admin = new Comment(admin);
        System.out.println("Admin " + admin.getDescription());

        User editor = new FinalUser();
        System.out.println();
        editor = new Delete(editor);
        editor = new Comment(editor);
        System.out.println("Editor " + editor.getDescription());

        User publicador = new FinalUser();
        System.out.println();
        publicador = new Publish(publicador);
        publicador = new Delete(publicador);
        publicador = new Comment(publicador);
        System.out.println("Publicador " + publicador.getDescription());

    }
}