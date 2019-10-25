package mx.iteso.privileges;

import mx.iteso.Privilege;
import mx.iteso.User;

public class Comment extends Privilege {
    private User user;

    public Comment(final User user){
        this.user = user;
    }

        @Override
        public String getDescription() {
            return user.getDescription() + "permiso de comentar";
        }

        public boolean canPublish(){
            return user.canPublish();
        }

        public boolean canComment(){
            return true;
        }

        public boolean canApprove(){
            return user.canApprove();
        }

        public boolean canDelete(){
            return user.canDelete();
        }
    }