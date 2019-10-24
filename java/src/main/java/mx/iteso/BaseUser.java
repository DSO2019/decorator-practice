package mx.iteso;

public class BaseUser extends User {

    public boolean publish()
    {
        return false;
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
        return false;
    }
}