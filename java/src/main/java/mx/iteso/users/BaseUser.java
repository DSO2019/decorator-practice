package mx.iteso.users;

import mx.iteso.User;

public class BaseUser extends User {

    public boolean publish() {
        return false;
    }

    public boolean edit() {
        return false;
    }

    public boolean delete() {
        return false;
    }

    public boolean approve() {
        return false;
    }
}
