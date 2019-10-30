package mx.iteso;


public class PublishPrivilege extends PrivilegeDecorator{
    User user;

    public PublishPrivilege(User user){
        this.user = user;
    }

    @Override
    public String getPrivilege(){
        return this.user.getUsername() + " puede publicar";
    }

    @Override
    public boolean publish(){
        System.out.print("Publicación hecha");
        return true;
    }

    @Override
    public boolean aprove(){
        return this.user.aprove();

    }

    @Override
    public boolean delete(){
        return this.user.delete();

    }

    @Override
    public boolean comment(){
        return this.user.comment();

    }

   
}