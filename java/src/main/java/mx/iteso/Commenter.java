package mx.iteso;

/** Commenter privlege class. */
public class Commenter extends PrivilegesDecorator {
    /** Real User to decorate. */
    private final User user;

    /**
     * Commenter constructor.
     * @param incomingUser user.
     */
    public Commenter(final User incomingUser) {
        this.user = incomingUser;
    }

    /**
     * Description of permission values.
     * @return String description.
     */
    @Override
    public String getDescription() {
        return "Commenter: " + user.getDescription();
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
     * Approval permission obtain function.
     * @return boolean Permission.
     */
    public boolean approvalPermission() {
        return user.approvalPermission();
    }

    /**
     * Comment permission allow function.
     * @return boolean Permission.
     */
    public boolean commentPermission() {
        System.out.println("Commenting permission enabled");
        return true;
    }
}
