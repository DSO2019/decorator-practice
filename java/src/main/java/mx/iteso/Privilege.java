package mx.iteso;

/**
 * Privilege class to describe each privilege granted to the user.
 */
public abstract class Privilege extends User {
    /**
     *
     * @return user description.
     */
    public abstract String getDescripcion();
}
