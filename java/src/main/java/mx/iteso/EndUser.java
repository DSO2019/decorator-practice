
public class EndUser extends User{

    public EndUser(username){
        this.username = username;
    }

    public boolean publish(){
        System.out.print("No tiene elprivilegio");
        return false;            
    }

    public boolean delete(){
        System.out.print("No tiene elprivilegio");
        return false;        
    }

    public boolean aprove(){
        System.out.print("No tiene elprivilegio");
        return false;
    }

    public boolean comment(){
        System.out.print("No tiene elprivilegio");
        return false;
    }
}