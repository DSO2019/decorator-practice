package mx.iteso;

/**
 * Clase decorador de privilegios.
 */
public abstract class PrivilegeDecorator extends User {
    /**
     * Devuelve el privilegio que es.
     * @return regresa el privilegio.
     */
    public abstract String getPrivilege();
}
