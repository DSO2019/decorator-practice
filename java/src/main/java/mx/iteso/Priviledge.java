package mx.iteso;

/**
 * Clase abstracta para crear decorators.
 */
public abstract class Priviledge extends User {
    /**
     * Para implementar decoration.
     * @return String con lo que si puede hacer
     */
    public abstract String getPriviledges();
}
