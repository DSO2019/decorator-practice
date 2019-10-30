package mx.iteso.users;

import mx.iteso.User;

/** BaseUser class. */
public class BaseUser extends User {

    /**
     *
     * @return has publish privileges
     */
    public boolean publish() {
        return false;
    }

    /**
     *
     * @return has edit privileges
     */
    public boolean edit() {
        return false;
    }

    /**
     *
     * @return has delete privileges
     */
    public boolean delete() {
        return false;
    }

    /**
     *
     * @return has approve privileges
     */
    public boolean approve() {
        return false;
    }
}
