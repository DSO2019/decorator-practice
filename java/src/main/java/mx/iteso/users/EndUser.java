package mx.iteso.users;

import mx.iteso.User;

/**
 * Created by Maggie Jauregui on 10/25/19.
 */
public class EndUser extends User {
    /**
     * Class constructor.
     * @param name user name/type.
     */
    public EndUser(final String name) {
        this.setName(name);
        this.setDelete("can't delete");
        this.setPublish("can't publish");
        this.setApprove("can't approve");
        this.setComment("can't comment");
    }

    /**
     * Gets user's delete permission.
     * @return user's current delete permission.
     */
    public String delete() {
        return this.getDelete();
    }

    /**
     * Gets user's publish permission.
     * @return user's current publish permission.
     */
    public String publish() {
        return this.getPublish();
    }

    /**
     * Gets user's approve permission.
     * @return user's current approve permission.
     */
    public String approve() {
        return this.getApprove();
    }

    /**
     * Gets user's comment permission.
     * @return user's current comment permission.
     */
    public String comment() {
        return this.getComment();
    }
}
