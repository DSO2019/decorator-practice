package mx.iteso.privileges;

import mx.iteso.User;
/**
 * Class.
 */
public class Comment extends User {

/**
* User.
*/
private User user;

/**
* Comment.
* @param usuario user.
*/
public Comment(final User usuario) {
this.user = usuario;
}

/**
 * Method.
 * @return description.
 */
@Override
public String getDesc() {
return user.getDesc() + " comment ";
}

/**
 * Method.
 * @return publish.
 */
@Override
public boolean canPublish() {
return user.canPublish();
}

/**
 * Method.
 * @return comment.
 */
@Override
public boolean canComment() {
return true;
}

/**
 * Method.
 * @return approve.
 */
@Override
public boolean canApprove() {
return user.canApprove();
}

/**
 * Method.
 * @return delete.
 */
@Override
public boolean canDelete() {
return user.canDelete();
}


}
