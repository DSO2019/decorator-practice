package mx.iteso;
/**
 * Clase para realizar pruebas con los usuarios.
 */
public final class TuUser {
    /** Private constructor for utility class. */
    private TuUser() {
    }
    /**Método main, para realizar pruebas.
     * @param args Argumentos de main.
     */
    public static void main(final String[] args) {
        User user = new UserBase();
        System.out.println(user.getDescription());
        System.out.println("Publish: " + user.publish() + " | Deletes: "
        + user.delete() + "\nApproves: " + user.approve()
        + " | Edits:" + user.comment());
        user = new Approver(user);
        user = new Publisher(user);
        user = new Deleter(user);
        user = new Commenter(user);

        System.out.println(user.getDescription());
        System.out.println("Publish: " + user.publish() + " | Deletes: "
        + user.delete() + "\nApproves: " + user.approve()
        + " | Edits:" + user.comment());
    }
}
