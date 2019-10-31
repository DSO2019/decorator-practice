package mx.iteso;

/** Publisher privlege class. */
public class Publisher extends PrivilegesDecorator {
    /** Real User to decorate. */
    private final User user;

    /** Publisher constructor.
     * @param incomingUser user.
     */
    public Publisher(final User incomingUser) {
        this.user = incomingUser;
    }

    /** Description of permission values.
     * @return String description.
     */
    @Override
    public String getDescription() {
        return "Publisher: " + user.getDescription();
    }

    /**
     * Publish permission allow function.
     * @return boolean Permission.
     */
    public boolean publishPermission() {
        System.out.println("Publish permission enabled");
        return true;
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
     * Comment permission obtain function.
     * @return boolean Permission.
     */
    public boolean commentPermission() {
        return user.commentPermission();
    }
}
