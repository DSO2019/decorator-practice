package mx.iteso;


public abstract class User {
    public String description = "User >";
    
    public String getDescription(){ return this.description; }
    public abstract boolean publish();
    public abstract boolean delete();
    public abstract boolean approve();
    public abstract boolean comment();
}
