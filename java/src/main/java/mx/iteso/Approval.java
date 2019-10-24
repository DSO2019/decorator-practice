package mx.iteso;

public class Approval extends User {
    User user;

    public Approval(User user) {
        this.user = user;
    }

    @Override
    public String getDescription() {
        return "Approval permission to: " + user.getDescription();
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
     * Approval permission allow function
     * 
     * @return Permission boolean
     */
    public boolean approvalPermission() {
        System.out.println("Approval permission enabled");
        return true;
    }

    /**
     * Comment permission obtain function
     * 
     * @return Permission boolean
     */
    public boolean commentPermission() {
        return user.commentPermission();
    }

}