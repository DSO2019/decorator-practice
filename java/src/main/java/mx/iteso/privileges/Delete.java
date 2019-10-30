package mx.iteso.privileges;

import mx.iteso.PrivilegeDecorator;
import mx.iteso.User;

import java.util.Set;
/** Delete decorator class.*/
public class Delete extends PrivilegeDecorator {
    /**
     * User attribute.
     */
    private User user;

    /**
     *
     * @param nUser user to be decorated
     */
    public Delete(final User nUser) {
        this.user = nUser;
        this.user.getPrivileges().add("delete");
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
        return user.edit();
    }

    /**
     *
     * @return has delete privilege
     */
    public boolean delete() {
        return user.getPrivileges().contains("delete");
    }

    /**
     *
     * @return has approve privileges
     */
    public boolean approve() {
        return user.approve();
    }
}
