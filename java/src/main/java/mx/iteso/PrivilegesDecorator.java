package mx.iteso;

/** Privileges Decorator Class. */
public abstract class PrivilegesDecorator extends User {
    /**
     * Description of permission values.
     * @return String description.
     */
    public abstract String getDescription();
}
