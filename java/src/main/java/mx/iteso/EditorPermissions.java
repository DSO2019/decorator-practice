package mx.iteso;

public class EditorPermissions extends PermissionsDecorator {
    User user;

    public EditorPermissions(User user){
        this.user = user;
    }

    @Override
    public String getDescription() {
        return "Editor " + user.getDescription();
    }

    public boolean canApprove(){
        System.out.println("You can approve.");
        return true;
    }

    public boolean canComment(){
        System.out.println("You can comment.");
        return true;
    }

    public boolean canPublish(){
        System.out.println("You can publish.");
        return true;
    }

    public boolean canDelete(){
        System.out.println("You can not delete.");
        return false;
    }

}