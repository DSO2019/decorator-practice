package mx.iteso;

public abstract class User {
    public String username = "usename";

    public String getUsername(){
        return username;
    }

    public abstract boolean publish();

    public abstract boolean delete();

    public abstract boolean aprove();

    public abstract boolean comment();
}
