package mx.iteso.privileges;
/**
 * Packages.
 */
import mx.iteso.PrivilegeDecorator;
import mx.iteso.User;

/**
 * Created by Maggie Jauregui on 10/25/19.
 */
public class Approve extends PrivilegeDecorator {
    /**
     * User to grant permission.
     */
    private final User user;
    /**
     * Privilege granted.
     */
    private final String privilege = "can approve";
    /**
     * Class constructor.
     * @param newUser to be set.
     */
    public Approve(final User newUser) {
        this.user = newUser;
    }

    /**
     * Getter for user.
     * @return user.
     */
    public User getUser() {
        return this.user;
    }

    /**
     * Gets user's current delete permission.
     * @return delete permission.
     */
    @Override
    public String delete() {
        return this.user.delete();
    }

    /**
     * Grants approve permission to user.
     * @return approve permission.
     */
    @Override
    public String approve() {
        return this.privilege;
    }

    /**
     * Gets user's current comment permission.
     * @return comment permission.
     */
    @Override
    public String comment() {
        return this.user.comment();
    }

    /**
     * Gets user's current publish permission.
     * @return publish permission.
     */
    @Override
    public String publish() {
        return this.user.publish();
    }
}
