package mx.iteso;

public class Publisher{
    public Publisher(EndUser user){

        user = new PublishPrivilege(user);
    }

}
