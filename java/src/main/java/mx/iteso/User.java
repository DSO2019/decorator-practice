package mx.iteso;

import java.util.HashSet;
import java.util.Set;

public abstract class User {
    private Set<String> privileges = new HashSet<String>();

    public Set<String> getPrivileges() {
        return this.privileges;
    }
    public abstract boolean publish();
    public abstract boolean edit();
    public abstract boolean delete();
    public abstract boolean approve();
}
