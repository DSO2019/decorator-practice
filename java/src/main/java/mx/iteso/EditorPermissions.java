package mx.iteso;
/**
    Editor permissions class.
 */
public class EditorPermissions extends PermissionsDecorator {
    /**
     * User.
     */
    private User user;

    /**
     * Constructor.
     * @param usr user.
     */
    public EditorPermissions(final User usr) {
        this.user = usr;
    }

    /**
     * getDescription.
     * @return description.
     */
    @Override
    public String getDescription() {
        return "Editor " + user.getDescription();
    }

    /**
     * canApprove.
     * @return permission.
     */
    public boolean canApprove() {
        System.out.println("You can approve.");
        return true;
    }

    /**
     * canComment.
     * @return permission.
     */
    public boolean canComment() {
        System.out.println("You can comment.");
        return true;
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
     * canDelete.
     * @return permission.
     */
    public boolean canDelete() {
        System.out.println("You can not delete.");
        return false;
    }

}
