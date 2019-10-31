
package mx.iteso;

/** RealUser implementation class. */
public class RealUser extends User {

    /**
     * Publish permission initially denied function.
     * @return boolean Permission.
     */
    public boolean publishPermission() {
        System.out.println("Publishing not allowed.");
        return false;
    }

    /**
     * Deletion permission initially denied function.
     * @return boolean Permission.
     */
    public boolean deletionPermission() {
        System.out.println("Deletion not allowed.");
        return false;
    }

    /**
     * Approval permission initially denied function.
     * @return boolean Permission.
     */
    public boolean approvalPermission() {
        System.out.println("Approval not allowed.");
        return false;
    }

    /**
     * Comment permission initially denied function.
     * @return boolean Permission.
     */
    public boolean commentPermission() {
        System.out.println("Commenting not allowed.");
        return false;
    }
}
