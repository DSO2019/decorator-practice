package mx.iteso;

public class Comment extends Privilege {
    private User user;

    public Comment (final User us){
        this.user = us;
    }

    @Override
    public String getDescripcion(){
        return user.getDescripcion() + "can comment";
    }

    @Override
    public boolean canComment(){
        return true;
    }

    @Override
    public boolean canPublish(){
        return user.canPublish();
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
