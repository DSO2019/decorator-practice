package mx.iteso;

public abstract class EditorPermissions extends PermissionsDecorator {
    User user;

    public EditorPermissions(User user){
        this.user = user;
    }

    @Override
    public String getDescription() {
        return "Editor " + user.getDescription();
    }

    public boolean canApprove(){
        System.out.println("You can approve.")
        return true;
    }

    public boolean canComment(){
        System.out.println("You can comment.")
        return true;
    }

    public boolean canPublish(){
        System.out.println("You can publish.")
        return true;
    }
}