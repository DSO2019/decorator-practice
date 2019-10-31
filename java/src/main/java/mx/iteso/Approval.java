package mx.iteso;

/** Approval privlege class. */
public class Approval extends PrivilegesDecorator {
    /** Real User to decorate. */
    private final User user;

    /**
     * Commenter constructor.
     * @param incomingUser user.
     */
    public Approval(final User incomingUser) {
        this.user = incomingUser;
    }

    /**
     * Description of permission values.
     * @return String description.
     */
    @Override
    public String getDescription() {
        return "Approval permission to: " + user.getDescription();
    }

    /**
     * Publish permission obtain function.
     * @return boolean Permission.
     */
    public boolean publishPermission() {
        return user.publishPermission();
    }

    /**
     * Deletion permission obtain function.
     * @return boolean Permission.
     */
    public boolean deletionPermission() {
        return user.deletionPermission();
    }

    /**
     * Approval permission allow function.
     * @return boolean Permission.
     */
    public boolean approvalPermission() {
        System.out.println("Approval permission enabled");
        return true;
    }

    /**
     * Comment permission obtain function.
     * @return boolean Permission.
     */
    public boolean commentPermission() {
        return user.commentPermission();
    }
}
