package mx.iteso;

/**
 * Clase UserBase, este es el usuario base.
 */
public class UserBase extends User {
    /** Metodo publish, regresa falso por default.
     * @return false.
     * */
    @Override
    public boolean publish() {
        return false;
    }
    /** Metodo comment, regresa falso por default.
     * @return false.
     * */
    @Override
    public boolean comment() {
        return false;
    }
    /** Metodo delete, regresa falso por default.
     * @return false.
     * */
    @Override
    public boolean delete() {
        return false;
    }
    /** Metodo approve, regresa falso por default.
     * @return false.
     * */
    @Override
    public boolean approve() {
        return false;
    }
}
