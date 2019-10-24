package mx.iteso;

public class Deletion extends User {
    User user;

    public Deletion(User user) {
        this.user = user;
    }

    @Override
    public String getDescription() {
        return "Deletion permission to: " + user.getDescription();
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
     * Deletion permission allow function
     * 
     * @return Permission boolean
     */
    public boolean deletionPermission() {
        System.out.println("Deletion permission enabled");
        return true;
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
     * Comment permission obtain function
     * 
     * @return Permission boolean
     */
    public boolean commentPermission() {
        return user.commentPermission();
    }

}