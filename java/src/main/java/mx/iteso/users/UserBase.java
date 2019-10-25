package mx.iteso.users;

import mx.iteso.User;

public class UserBase extends User {

    public UserBase(){
        this.description = "Base user > ";
    }
    
    @Override
    public boolean publish() {
        return false;
    }

    @Override
    public boolean edit() {
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