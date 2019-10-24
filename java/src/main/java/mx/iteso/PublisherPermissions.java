package mx.iteso;

public abstract class PublisherPermissions extends PermissionsDecorator {
    User user;

    public PublisherPermissions(User user){
        this.user = user;
    }

    @Override
    public String getDescription() {
        return "Publisher " + user.getDescription();
    }

    public boolean canPublish(){
        System.out.println("You can publish.")
        return true;
    }
}