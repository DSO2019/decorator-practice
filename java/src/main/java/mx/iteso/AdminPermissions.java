package mx.iteso;

public abstract class AdminPermissions extends PermissionsDecorator {
    User user;

    public AdminPermissions(User user){
        this.user = user;
    }

    @Override
    public String getDescription() {
        return "Admin " + user.getDescription();
    }

    public boolean canApprove(){
        System.out.println("You can approve.")
        return true;
    }

    public boolean canComment(){
        System.out.println("You can comment.")
        return true;
    }

    public boolean canDelete(){
        System.out.println("You can delete.")
        return true;
    }

    public boolean canPublish(){
        System.out.println("You can publish.")
        return true;
    }
}