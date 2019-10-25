package mx.iteso;

public class Delete extends Privilege {
    private User user;

    public Delete (final User us){
        this.user = us;
    }

    @Override
    public String getDescripcion(){
        return user.getDescripcion() + "can delete";
    }

    @Override
    public boolean canDelete(){
        return true;
    }

    @Override
    public boolean canComment(){
        return user.canComment();
    }

    @Override
    public boolean canPublish(){
        return user.canPublish();
    }

    @Override
    public boolean canApprove(){
        return user.canApprove();
    }
}
