package mx.iteso;

/**
 * Abstract class User
 */
public abstract class User {
    public String description = "Any User";

    public String getDescription(){
        return description;
    }

    public abstract boolean canPublish ();
    public abstract boolean canComment ();
    public abstract boolean canApprove ();
    public abstract boolean canDelete ();

}
