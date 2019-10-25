package mx.iteso;

public class Approve extends Privilege {
    private User user;

    public Approve(final User us){
        this.user = us;
    }

    public String getDescripcion(){
        return user.getDescripcion() + "can approve";
    }

    @Override
    public boolean canApprove(){
        return true;
    }

    @Override
    public boolean canComment(){
        return user.canComment();
    }

    @Override
    public boolean canDelete(){
        return user.canComment();
    }

    @Override
    public boolean canPublish(){
        return user.canPublish();
    }

}
