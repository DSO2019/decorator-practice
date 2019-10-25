package mx.iteso;

/**
 *User.
 */
public abstract class User {

/**
* Description.
*/
private String description = "user";

/**
 * Method.
 * @return description.
 */
public String getDesc() {
return description;
}

/**
 * Method.
 * @param desc description.
 */
public void setDesc(final String desc) {
this.description = desc;
}

/**
 * Method.
 * @return publish.
 */
public abstract boolean canPublish();

/**
 * Method.
 * @return comment.
 */
public abstract boolean canComment();

/**
 * Method.
 * @return approve.
 */
public abstract boolean canApprove();

/**
 * Method.
 * @return delete.
 */
public abstract boolean canDelete();

}

