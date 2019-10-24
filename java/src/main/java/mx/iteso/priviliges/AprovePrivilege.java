public class DeletePrivilege extends PrivilegeDecorator{
    User user;

    public AdminPrivilege(User user){
        this.user = user;
    }

    @Override
    public String getPrivilege(){
        return "Puede Aprovar";
    }

    public boolean aprove(){
        System.out.print("Aprobación hecha");
        return True;
    }

}