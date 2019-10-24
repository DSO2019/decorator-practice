
package mx.iteso;

public class RealUser extends User{
    public boolean publishPermission(){
        System.out.println("Publishing not allowed.");
        return false;
    }

    public boolean deletionPermission(){
        System.out.println("Deletion not allowed.");
        return false;
    }

    public boolean approvalPermission(){
        System.out.println("Approval not allowed.");
        return false;
    }

    public boolean commentPermission(){
        System.out.println("Commenting not allowed.");
        return false;
    }
}