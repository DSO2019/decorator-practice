package mx.iteso;

/**
 * Clase abstracta PrivilegeDecorator,
 * extiende a un usuario y tiene el metodo getDescription().
 */
public abstract class PrivilegeDecorator extends User {
    /**@return descripción, método abstracto. */
    public abstract String getDescription();
}
