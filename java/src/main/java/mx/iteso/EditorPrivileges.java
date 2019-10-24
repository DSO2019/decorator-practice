package mx.iteso;

public class EditorPrivileges extends Privilege {

    private String description = "Im an Editor";

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
        return true;
    }
    public boolean comment()
    {
        return true;
    }
}
