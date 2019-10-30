package mx.iteso;

public class AprovePrivilege extends PrivilegeDecorator{
    User user;

    public AprovePrivilege(User user){
        this.user = user;
    }

    @Override
    public String getPrivilege(){
        return this.user.getUsername() + " puede aprobar";
    }

    @Override
    public boolean aprove(){
        System.out.print("Aprobación hecha");
        return true;
    }

    @Override
    public boolean comment(){
        return this.user.comment();

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