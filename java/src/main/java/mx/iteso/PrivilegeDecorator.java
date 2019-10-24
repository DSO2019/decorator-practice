package mx.iteso;

import java.util.Set;

public abstract class PrivilegeDecorator extends User{
    public abstract Set<String> getPrivileges();
    public abstract boolean publish();
    public abstract boolean edit();
    public abstract boolean delete();
    public abstract boolean approve();
}
