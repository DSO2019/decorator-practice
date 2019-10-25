package mx.iteso;

public class Publish extends Privilege {
    private User user;

    public Publish (final User us){
        this.user = us;
    }

    @Override
    public String getDescripcion(){
        return user.getDescripcion() + "can publish";
    }

    @Override
    public boolean canPublish(){
        return true;
    }

    @Override
    public boolean canComment(){
        return user.canComment();
    }

    @Override
    public boolean canDelete(){
        return user.canDelete();
    }

    @Override
    public boolean canApprove(){
        return user.canApprove();
    }
}
