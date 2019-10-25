package mx.iteso;

/**
 * Abstract class User.
 */
public abstract class User {

    /**
     * Description.
     */
    private String description = "Any User";

    /**
     * Get description method.
     * @return description.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Set description method.
     * @param desc description.
     */
    public void setDescription(final String desc) {
        this.description = desc;
    }

    /**
     * Can publish method.
     * @return can publish.
     */
    public abstract boolean canPublish();

    /**
     * Can comment method.
     * @return can comment.
     */
    public abstract boolean canComment();

    /**
     * Can approve method.
     * @return can approve.
     */
    public abstract boolean canApprove();

    /**
     * Can delete method.
     * @return can delete.
     */
    public abstract boolean canDelete();

}
