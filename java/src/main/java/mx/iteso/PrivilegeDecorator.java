package mx.iteso;

/**
 * Decorator for privilege classes.
 */
public abstract class PrivilegeDecorator extends User {

    /**
     * Get description abstract class.
     * @return Description.
     */
    public abstract String getDescription();
}
