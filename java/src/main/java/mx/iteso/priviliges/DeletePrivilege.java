public class DeletePrivilege extends PrivilegeDecorator{
    User user;

    public AdminPrivilege(User user){
        this.user = user;
    }

    @Override
    public String getPrivilege(){
        return "Puede Borrar";
    }

    public boolean publish(){
        System.out.print("Publicación hecha");
        return True;
    }

    public boolean delete(){
        System.out.print("Eliminación hecha");
        return True;
    }

    public boolean aprove(){
        System.out.print("Aprobación hecha");
        return True;
    }

    public boolean comment(){
        System.out.print("Comentario hecho");
        return True;
    }
}