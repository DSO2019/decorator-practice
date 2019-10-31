package mx.iteso;

public abstract class User {
    /** @return New User with approve privileges.  */
    public abstract String approve();
    /** @return New User with comment privileges.  */
    public abstract String comment();
    /** @return New User with delete privileges.  */
    public abstract String delete();
    /** @return New User with publish privileges.  */
    public abstract String publish();
}
