package mx.iteso;
/**
    User class.
 */
public abstract class User {
    /**
     * description.
     */
    private String description = "User";

    /**
     * getDescription.
     * @return description.
     */
    public String getDescription() {
        return description;
    }

    /**
     * canApprove.
     * @return permission.
     */
    public abstract boolean canApprove();

    /**
     * canComment.
     * @return permission.
     */
    public abstract boolean canComment();

    /**
     * canDelete.
     * @return permission.
     */
    public abstract boolean canDelete();

    /**
     * canPublish.
     * @return permission.
     */
    public abstract boolean canPublish();
}
