package mx.iteso;

public class PublisherPermissions extends PermissionsDecorator {
    User user;

    public PublisherPermissions(User user){
        this.user = user;
    }

    @Override
    public String getDescription() {
        return "Publisher " + user.getDescription();
    }

    public boolean canPublish(){
        System.out.println("You can publish.");
        return true;
    }

    public boolean canApprove(){
        System.out.println("You can not approve.");
        return false;
    }

    public boolean canComment(){
        System.out.println("You can not comment.");
        return false;
    }
    
    public boolean canDelete(){
        System.out.println("You can not delete.");
        return false;
    }
}