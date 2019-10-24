package mx.iteso;

public class PublisherPrivileges extends Privilege {

    private String description = "Im an Publisher";

    public boolean publish()
    {
        return true;
    }
    public boolean delete()
    {
        return false;
    }
    public boolean approve()
    {
        return false;
    }
    public boolean comment()
    {
        return true;
    }
}
