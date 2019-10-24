package mx.iteso;

public class BaseUser extends User{
    public boolean canApprove(){
        System.out.println("You can not approve.")
        return false;
    }

    public boolean canComment(){
        System.out.println("You can not comment.")
        return false;
    }

    public boolean canDelete(){
        System.out.println("You can not delete.")
        return false;
    }

    public boolean canPublish(){
        System.out.println("You can not publish.")
        return false;
    }
}