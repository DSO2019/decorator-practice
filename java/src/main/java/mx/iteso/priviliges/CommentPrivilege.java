package mx.iteso;

public class CommentPrivilege extends PrivilegeDecorator{
    User user;

    public CommentPrivilege(User user){
        this.user = user;
    }

    @Override
    public String getPrivilege(){
        return this.user.getUsername() + " puede comentar";
    }

    @Override
    public boolean comment(){
        System.out.print("Comentario hecho");
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
    public boolean publish(){
        return this.user.publish();

    }
}