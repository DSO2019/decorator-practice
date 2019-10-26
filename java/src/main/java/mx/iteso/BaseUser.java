package mx.iteso;
/**
    Base user class.
 */
public class BaseUser extends User {
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

    /**
     * canPublish.
     * @return permission.
     */
    public boolean canPublish() {
        System.out.println("You can not publish.");
        return false;
    }
}
