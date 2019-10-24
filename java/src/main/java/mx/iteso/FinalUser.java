package mx.iteso;

public class FinalUser extends User {
    public FinalUser(){
        description = "User with privileges: ";
    }

    @Override
    public boolean canPublish() {
        return false;
    }

    @Override
    public boolean canComment() {
        return false;
    }

    @Override
    public boolean canApprove() {
        return false;
    }

    @Override
    public boolean canDelete() {
        return false;
    }
    
}