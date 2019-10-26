package mx.iteso;
/**
    Publisher permissions class.
 */
public class PublisherPermissions extends PermissionsDecorator {
    /**
     * User.
     */
    private User user;

    /**
     * Constructor.
     * @param usr user.
     */
    public PublisherPermissions(final User usr) {
        this.user = usr;
    }

    /**
     * getDescription.
     * @return description.
     */
    @Override
    public String getDescription() {
        return "Publisher " + user.getDescription();
    }

    /**
     * canPublish.
     * @return permission.
     */
    public boolean canPublish() {
        System.out.println("You can publish.");
        return true;
    }

    /**
     * canApprove.
     * @return permission.
     */
    public boolean canApprove() {
        System.out.println("You can not approve.");
        return false;
    }

    /**
     * canComment.
     * @return permission.
     */
    public boolean canComment() {
        System.out.println("You can not comment.");
        return false;
    }

    /**
     * canDelete.
     * @return permission.
     */
    public boolean canDelete() {
        System.out.println("You can not delete.");
        return false;
    }
}
