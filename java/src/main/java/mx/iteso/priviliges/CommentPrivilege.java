public class DeletePrivilege extends PrivilegeDecorator{
    User user;

    public AdminPrivilege(User user){
        this.user = user;
    }

    @Override
    public String getPrivilege(){
        return "Puede Comentar";
    }

    public boolean comment(){
        System.out.print("Comentario hecho");
        return True;
    }
}