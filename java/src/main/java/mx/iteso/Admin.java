package mx.iteso;

public class Admin{
    public Admin(EndUser user){
        user = new AprovePrivilege(user);
        user = new DeletePrivilege(user);
        user = new CommentPrivilege(user);
        user = new PublishPrivilege(user);
    }

}
