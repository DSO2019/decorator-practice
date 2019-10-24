package mx.iteso;

public class Commenter extends User {
    User user;

    public Commenter(User user) {
        this.user = user;
    }

    @Override
    public String getDescription() {
        return "Commenter: " + user.getDescription();
    }

    /**
     * Publish permission obtain function
     * 
     * @return Permission boolean
     */
    public boolean publishPermission() {
        return user.publishPermission();
    }

    /**
     * Deletion permission obtain function
     * 
     * @return Permission boolean
     */
    public boolean deletionPermission() {
        return user.deletionPermission();
    }

    /**
     * Approval permission obtain function
     * 
     * @return Permission boolean
     */
    public boolean approvalPermission() {
        return user.approvalPermission();
    }

    /**
     * Comment permission allow function
     * 
     * @return Permission boolean
     */
    public boolean commentPermission() {
        System.out.println("Commenting permission enabled");
        return true;
    }

}