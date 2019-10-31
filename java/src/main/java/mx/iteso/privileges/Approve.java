package mx.iteso.privileges;

import mx.iteso.PrivilegeDecorator;
import mx.iteso.User;

/**
 * Class.
 */
public class Approve extends PrivilegeDecorator {

/**
* User.
*/
private User user;

/**
* Approve.
* @param usuario user.
*/
public Approve(final User usuario) {
this.user = usuario;
 }

/**
 * Method.
 * @return description.
 */
@Override
public String getDesc() {
return user.getDesc() + "approve ";
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
return true;
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
