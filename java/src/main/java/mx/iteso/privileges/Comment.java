package mx.iteso.privileges;

import mx.iteso.Privilege;
import mx.iteso.User;

/**
 * Privilege to Commnet.
 */
public class Comment extends Privilege {
    /**
     * New user to add privilege.
     */
    private User user;

    /**
     *
     * @param use to get commnet privilege.
     */
    public Comment(final User use) {
        this.user = use;
    }

    /**
     *
     * @return commnets des cription.
     */
    @Override
        public String getDescription() {
            return user.getDescription() + "permiso de comentar";
        }

    /**
     *
     * @return publish description.
     */
        public boolean canPublish() {
            return user.canPublish();
        }

    /**
     *
     * @return commnet description.
     */
        public boolean canComment() {
            return true;
        }

    /**
     *
     * @return approve description.
     */
        public boolean canApprove() {
            return user.canApprove();
        }

    /**
     *
     * @return delete description.
     */
        public boolean canDelete() {
            return user.canDelete();
        }
    }
