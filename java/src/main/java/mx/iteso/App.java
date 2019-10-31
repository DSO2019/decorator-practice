package mx.iteso;

import mx.iteso.privileges.Approve;
import mx.iteso.privileges.Comment;
import mx.iteso.privileges.Delete;
import mx.iteso.privileges.Publish;

final class App {
    /**Constructor.*/
    private App() {
    }
    /**
     * @param args args.
     */
    public static void main(final String[] args) {
        User admin = new FinalUser();

        System.out.println("Admin " + admin.publish());
        System.out.println("Admin " + admin.approve());
        System.out.println("Admin " + admin.delete());
        System.out.println("Admin " + admin.comment());

        admin = new Comment(admin);
        System.out.println("Admin " + admin.publish());
        System.out.println("Admin " + admin.approve());
        System.out.println("Admin " + admin.delete());
        System.out.println("Admin " + admin.comment());

        admin = new Approve(admin);
        System.out.println("Admin " + admin.publish());
        System.out.println("Admin " + admin.approve());
        System.out.println("Admin " + admin.delete());
        System.out.println("Admin " + admin.comment());

        admin = new Publish(admin);
        System.out.println("Admin " + admin.publish());
        System.out.println("Admin " + admin.approve());
        System.out.println("Admin " + admin.delete());
        System.out.println("Admin " + admin.comment());

        admin = new Delete(admin);
        System.out.println("Admin " + admin.publish());
        System.out.println("Admin " + admin.approve());
        System.out.println("Admin " + admin.delete());
        System.out.println("Admin " + admin.comment());
    }
}
