package mx.iteso;

public class Editor{
    public Editor(EndUser user){
        user = new AprovePrivilege(user);
        user = new CommentPrivilege(user);
        user = new PublishPrivilege(user);
    }

}