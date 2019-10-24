package mx.iteso;

public abstract class User {
    public String description = "User";

    public String getDescription(){
        return description;
    }
    
    public abstract boolean canApprove();
    public abstract boolean canComment();
    public abstract boolean canDelete();
    public abstract boolean canPublish();
}
