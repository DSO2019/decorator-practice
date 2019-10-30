package mx.iteso;

/**
 * Created by ElMaligno666 on October 2019.
 */
final class Main {

    /**
     * Main constructor.
     */
    private Main() {

    }

    /**
     * @param args
     * Main class for testing.
     */
    public static void main(final String[] args) {
        User admin = new FinalUser();
        System.out.println(admin.approve());
        System.out.println(admin.publish());
        System.out.println(admin.delete());
        System.out.println(admin.comment());
        System.out.println();

        admin = new Approve(admin);
        System.out.println(admin.approve());
        System.out.println(admin.publish());
        System.out.println(admin.delete());
        System.out.println(admin.comment());
        System.out.println();

        admin = new Comment(admin);
        System.out.println(admin.approve());
        System.out.println(admin.publish());
        System.out.println(admin.delete());
        System.out.println(admin.comment());
        System.out.println();

        admin = new Publish(admin);
        System.out.println(admin.approve());
        System.out.println(admin.publish());
        System.out.println(admin.delete());
        System.out.println(admin.comment());
        System.out.println();

        admin = new Delete(admin);
        System.out.println(admin.approve());
        System.out.println(admin.publish());
        System.out.println(admin.delete());
        System.out.println(admin.comment());
        System.out.println();


    }
}
