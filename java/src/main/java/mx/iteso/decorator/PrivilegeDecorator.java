package mx.iteso;
/**
 * Privilege Decorator.
 */
public abstract class PrivilegeDecorator extends User {
	/**
	 * @return string of privileges.
	 */
	public abstract String getPrivileges();
	/**
	 * @return string of the user name.
	 */
	public abstract String getName();
}
