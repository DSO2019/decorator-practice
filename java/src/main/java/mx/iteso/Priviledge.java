package mx.iteso;

public abstract class Priviledge extends User {
    /**
     * Para implementar decoration.
     * @return String con lo que si puede hacer
     */
    public abstract String getPriviledges();
}
