package mx.iteso;

import java.util.HashSet;
import java.util.Set;

/**
 * Abstract user  class.
 */
public abstract class User {
    /** User privileges set.*/
    private Set<String> privileges = new HashSet<String>();

    /**
     *
     * @return Privileges of the user.
     */
    public Set<String> getPrivileges() {
        return this.privileges;
    }

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
