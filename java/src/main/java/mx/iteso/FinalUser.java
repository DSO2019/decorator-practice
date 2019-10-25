package mx.iteso;

public class FinalUser extends User{

    public FinalUser(){
        setDescripcion("Usuario con privilegios;");
    }

    @Override
    public boolean canApprove(){
        return false;
    }

    @Override
    public boolean canComment(){
        return false;
    }

    @Override
    public boolean canDelete(){
        return false;
    }

    @Override
    public boolean canPublish(){
        return false;
    }
}
