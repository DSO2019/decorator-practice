package mx.iteso.privileges;

import mx.iteso.User;

/**
 * Class.
 */
public class Delete extends User {

/**
* User.
*/
private User user;

/**
* Delete.
* @param usuario user.
*/
public Delete(final User usuario) {
this.user = usuario;
}

/**
 * Method.
 * @return description.
 */
@Override
public String getDesc() {
return user.getDesc() + " delete ";
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
return user.canComment();
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
return true;
}
}
