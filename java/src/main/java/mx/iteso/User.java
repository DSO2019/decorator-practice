package mx.iteso;

/**
 * Created by Maggie Jauregui on 10/25/19.
 */
public abstract class User {
    /**
     * User type name.
     */
    private String name = "My name";
    /**
     * Describes publish permission.
     */
    private String publishPermission;
    /**
     * Describes delete permission.
     */
    private String deletePermission;
    /**
     * Describes comment permission.
     */
    private String commentPermission;
    /**
     * Describes approve permission.
     */
    private String approvePermission;

    /**
     * Getter method for name.
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter method for name.
     * @param newName new name.
     */
    public void setName(final String newName) {
        this.name = newName;
    }

    /**
     * Getter method for canPublish.
     * @return publishPermission.
     */
    public String getPublish() {
        return this.publishPermission;
    }

    /**
     * Setter method for canPublish.
     * @param permission permission.
     */
    public void setPublish(final String permission) {
        this.publishPermission = permission;
    }

    /**
     * Getter method for canApprove.
     * @return canApprove
     */
    public String getApprove() {
        return this.approvePermission;
    }

    /**
     * Setter method for approvePermission.
     * @param permission permission.
     */
    public void setApprove(final String permission) {
        this.approvePermission = permission;
    }

    /**
     * Getter method for commentPermission.
     * @return canComment
     */
    public String getComment() {
        return this.commentPermission;
    }

    /**
     * Setter method for commentPermission.
     * @param permission permission.
     */
    public void setComment(final String permission) {
        this.commentPermission = permission;
    }

    /**
     * Getter method for deletePermission.
     * @return canDelete
     */
    public String getDelete() {
        return  this.deletePermission;
    }

    /**
     * Setter method for canDelete.
     * @param permission permission.
     */
    public void setDelete(final String permission) {
        this.deletePermission = permission;
    }

    /**
     * Method to get user's delete permissions.
     * @return delete permission.
     */
    public abstract String delete();

    /**
     * Method to get user's publish permissions.
     * @return publish permission.
     */
    public abstract String publish();

    /**
     * Method to get user's approving permissions.
     * @return approving permissions.
     */
    public abstract String approve();

    /**
     * Method to get user's comment permissions.
     * @return comment permissions
     */
    public abstract String comment();
}
