package mx.iteso.privileges;

import mx.iteso.PrivilegeDecorator;
import mx.iteso.User;

import java.util.Set;

/**
 * Edit decorator class.
 */
public class Edit extends PrivilegeDecorator {
    /**
     * User attribute.
     */
    private User user;

    /**
     *
     * @param nUser user to be decorated
     */
    public Edit(final User nUser) {
        this.user = nUser;
        this.user.getPrivileges().add("edit");
    }

    /**
     *
     * @return privileges of the user
     */
    public Set<String> getPrivileges() {
        return user.getPrivileges();
    }

    /**
     *
     * @return has publish privilege
     */
    public boolean publish() {
        return user.publish();
    }

    /**
     *
     * @return has edit privilege
     */
    public boolean edit() {
        return user.getPrivileges().contains("edit");
    }

    /**
     *
     * @return has delete privilege
     */
    public boolean delete() {
        return user.delete();
    }

    /**
     *
     * @return has approve privilege
     */
    public boolean approve() {
        return user.approve();
    }
}
