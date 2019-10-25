package mx.iteso.privileges;
import mx.iteso.User;

/**
 * Class.
 */
public class Publish extends User {

/**
* User.
*/
private User user;


/**
* Publish.
* @param usuario user.
*/
public Publish(final User usuario) {
this.user = usuario;
}

/**
 * Method.
 * @return description.
 */
@Override
public String getDesc() {
return user.getDesc() + " publish ";
}

/**
 * Method.
 * @return publish.
 */
@Override
public boolean canPublish() {
return true;
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
return user.canDelete();
}

}
