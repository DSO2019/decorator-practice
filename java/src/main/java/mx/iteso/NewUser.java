package mx.iteso;

public class NewUser extends User{

    public NewUser(){
        setDescription("Este es un nuevo usuario y tiene permiso para ");
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
