package mx.iteso;

public abstract class User {

    public String description = "User";

    public String getDescription() {
        return description;
    }

    public void setDescription(final String desc) {
        this.description = description;
    }

    public abstract boolean canPublish();

    public abstract boolean canComment();

    public abstract boolean canApprove();

    public abstract boolean canDelete();
}
