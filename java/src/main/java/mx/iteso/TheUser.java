package mx.iteso;

/**
 * Class TheUser.
 */
public class TheUser extends User {
    /**
     * Publish permission.
     *
     * @return boolean.
     */
    public boolean publishPermission() {
        System.out.println("Publish not allowed.");
        return false;
    }

    /**
     * Delete Permission.
     *
     * @return boolean.
     */
    public boolean deletePermission() {
        System.out.println("Delete not allowed.");
        return false;
    }

    /**
     * Approve Permission.
     *
     * @return boolean.
     */
    public boolean approvePermission() {
        System.out.println("Approve not allowed.");
        return false;
    }

    /**
     * Comment Permission.
     *
     * @return boolean.
     */
    public boolean commentPermission() {
        System.out.println("Comment not allowed.");
        return false;
    }
}
