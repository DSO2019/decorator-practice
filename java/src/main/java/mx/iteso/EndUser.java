package mx.iteso;

public class EndUser extends User{

    public EndUser(String username){
        this.username = username;
    }

    @Override
    public boolean publish(){
        System.out.print("No tiene elprivilegio");
        return false;            
    }

    @Override
    public boolean delete(){
        System.out.print("No tiene elprivilegio");
        return false;        
    }

    @Override
    public boolean aprove(){
        System.out.print("No tiene elprivilegio");
        return false;
    }
    
    @Override
    public boolean comment(){
        System.out.print("No tiene elprivilegio");
        return false;
    }
}