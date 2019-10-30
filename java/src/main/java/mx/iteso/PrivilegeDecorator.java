package mx.iteso;

import java.util.Set;

/**
 * Privileges decorator class.
 */
public abstract class PrivilegeDecorator extends User {
    /**
     *
     * @return Privileges of the user
     */
    public abstract Set<String> getPrivileges();
     /**
     *
     * @return has publish privileges
     */
    public abstract boolean publish();

    /**
     *
     * @return has edit privileges
     */
    public abstract boolean edit();

    /**
     *
     * @return has delete privileges
     */
    public abstract boolean delete();

    /**
     *
     * @return has approve privileges
     */
    public abstract boolean approve();
}
