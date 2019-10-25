package mx.iteso;

/**
* class.
*/
public class FinalUser extends User {


/**
 * Constructor.
*/
public FinalUser() {
setDesc("User with the following privileges: ");
}

/**
 * method.
 */
@Override
public boolean canPublish() {
   return false;
}

/**
 * method.
 */
@Override
public boolean canComment() {
return false;
}

/**
 * method.
 */
@Override
public boolean canApprove() {
return false;
}

/**
 * method.
 */
@Override
public boolean canDelete() {
return false;
}

}
