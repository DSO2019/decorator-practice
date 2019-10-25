package mx.iteso;

public abstract class User {
    public String name = "My name";
    public boolean canPublish = false;
    public boolean canApprove = false;
    public boolean canComment = false;
    public boolean canDelete = false;

    public String publishPermission;
    public String deletePermission;
    public String commentPermission;
    public String approvePermission;

    public String getName() {
        return this.name;
    }
    public abstract String delete();
    public abstract String publish();
    public abstract String approve();
    public abstract String comment();
}
