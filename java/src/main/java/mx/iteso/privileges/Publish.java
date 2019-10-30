package mx.iteso.privileges;

import mx.iteso.PrivilegeDecorator;
import mx.iteso.User;

import java.util.Set;

/** Publish decorator class.*/
public class Publish extends PrivilegeDecorator {
    /** User attribute. */
    private User user;

    /**
     *
     * @param nUser user to be decorated
     */
    public Publish(final User nUser) {
        this.user = nUser;
        this.user.getPrivileges().add("publish");
    }

    /**
     *
     * @return Privileges of the user
     */
    public Set<String> getPrivileges() {
        return user.getPrivileges();
    }

    /**
     *
     * @return has publish privileges
     */
    public boolean publish() {
        return user.getPrivileges().contains("publish");
    }

    /**
     *
     * @return has edit privileges
     */
    public boolean edit() {
        return user.edit();
    }

    /**
     *
     * @return has delete privileges
     */
    public boolean delete() {
        return user.delete();
    }

    /**
     *
     * @return has approve privileges
     */
    public boolean approve() {
        return user.approve();
    }
}
