package mx.iteso;

/**
 * Created by Maggie Jauregui on 10/25/19.
 */
public abstract class PrivilegeDecorator extends User {
    /**
     * Delete abstract method.
     * @return delete permission.
     */
    public abstract String delete();

    /**
     * Publish abstract method.
     * @return publish permission.
     */
    public abstract String publish();

    /**
     * Approve abstract method.
     * @return approve permission.
     */
    public abstract String approve();

    /**
     * Comment abstract method.
     * @return comment permission.
     */
    public abstract String comment();
}
