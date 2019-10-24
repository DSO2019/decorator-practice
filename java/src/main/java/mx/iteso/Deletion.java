package mx.iteso;

/** Deletion privlege class. */
public class Deletion extends User {
    /** Real User to decorate. */
    private final User user;

    /**
     * Deletion constructor.
     * @param incomingUser user.
     */
    public Deletion(final User incomingUser) {
        this.user = incomingUser;
    }

    /**
     * Description of permission values.
     * @return String description.
     */
    @Override
    public String getDescription() {
        return "Deletion permission to: " + user.getDescription();
    }

    /**
     * Publish permission obtain function.
     * @return boolean Permission.
     */
    public boolean publishPermission() {
        return user.publishPermission();
    }

    /**
     * Deletion permission allow function.
     * @return boolean Permission.
     */
    public boolean deletionPermission() {
        System.out.println("Deletion permission enabled");
        return true;
    }

    /**
     * Approval permission obtain function.
     * @return boolean Permission.
     */
    public boolean approvalPermission() {
        return user.approvalPermission();
    }

    /**
     * Comment permission obtain function.
     * @return boolean Permission.
     */
    public boolean commentPermission() {
        return user.commentPermission();
    }
}
