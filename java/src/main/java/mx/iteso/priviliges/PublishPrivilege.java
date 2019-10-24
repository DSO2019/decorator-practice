
public class PublishPrivilege extends PrivilegeDecorator{
    User user;

    public PublishPrivilege(User user){
        this.user = user;
    }

    @Override
    public String getPrivilege(){
        return user.getUsername + "puede Publicar";
    }

    @Override
    public boolean publish(){
        System.out.print("Publicación hecha");
        return true;
    }

   
}