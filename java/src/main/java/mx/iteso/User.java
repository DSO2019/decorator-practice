
package mx.iteso;

/** User implementation. */
public abstract class User {
    /** Description initial string. */
    private String description = "Current user";

    /** Description of permission values.
     * @return String description.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Publish permission allow function.
     *
     * @return boolean Permission.
     */
    public abstract boolean publishPermission();
    /**
     * Deletion permission allow function.
     *
     * @return boolean Permission.
     */
    public abstract boolean deletionPermission();
    /**
     * Approval permission allow function.
     *
     * @return boolean Permission.
     */
    public abstract boolean approvalPermission();
    /**
     * Comment permission allow function.
     *
     * @return boolean Permission.
     */
    public abstract boolean commentPermission();
}
