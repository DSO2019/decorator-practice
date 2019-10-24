package mx.iteso;

public class AdminPrivileges extends Privilege {

    private String description = "Im an Admin";

    public boolean publish()
    {
        return true;
    }
    public boolean delete()
    {
        return true;
    }
    public boolean approve()
    {
        return true;
    }
    public boolean comment()
    {
        return true;
    }
}
