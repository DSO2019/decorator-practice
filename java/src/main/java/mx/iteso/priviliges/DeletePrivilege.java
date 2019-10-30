package mx.iteso;

public class DeletePrivilege extends PrivilegeDecorator{
    User user;

    public DeletePrivilege(User user){
        this.user = user;
    }

    @Override
    public String getPrivilege(){
        return this.user.getUsername() + " puede borrar";
    }


    @Override
    public boolean delete(){
        System.out.print("Eliminación hecha");
        return true;
    }

    @Override
    public boolean aprove(){
        return this.user.aprove();

    }

    @Override
    public boolean comment(){
        return this.user.comment();

    }

    @Override
    public boolean publish(){
        return this.user.publish();

    }
    
}