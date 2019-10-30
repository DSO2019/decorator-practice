package mx.iteso;

/**
 * Created by ElMaligno666 on October 2019.
 */
public abstract class User {

    /**
     * @return right to publish
     */
    public abstract String publish();

    /**
     * @return right to delete
     */
    public abstract String delete();

    /**
     * @return right to approve
     */
    public abstract String approve();

    /**
     * @return right to comment
     */
    public abstract String comment();
}
