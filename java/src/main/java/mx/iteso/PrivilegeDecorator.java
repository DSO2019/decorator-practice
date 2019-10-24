package mx.iteso;

public abstract class PrivilegeDecorator extends User {
    public abstract String delete();
    public abstract String publish();
    public abstract String approve();
    public abstract String comment();
}
