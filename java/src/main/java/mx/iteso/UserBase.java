package mx.iteso;

import mx.iteso.User;

public class UserBase extends User {
    

    @Override
    public boolean publish() {
        return false;
    }

    @Override
    public boolean comment() {
        return false;
    }

    @Override
    public boolean delete() {
        return false;
    }

    @Override
    public boolean approve() {
        return false;
    }
}