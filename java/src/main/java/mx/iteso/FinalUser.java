package mx.iteso;

public class FinalUser extends User {
    /**  @return New User with no publish privileges. */
    public String publish() {
        return "No privileges for publish";
    }

    /**  @return New User with no delete privileges. */
    public String delete() {
        return "No privileges for delete";
    }

    /**  @return New User with no approve privileges. */
    public String approve() {
        return "No privileges for approve";
    }

    /**  @return New User with no comment privileges. */
    public String comment() {
        return "No privileges for comment";
    }
}
