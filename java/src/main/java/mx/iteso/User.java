package mx.iteso;

public abstract class User {

    private String description;

    public String getDescription()
    {
        return this.description;
    }

    public abstract boolean publish();
    public abstract boolean delete();
    public abstract boolean approve();
    public abstract boolean comment();

}