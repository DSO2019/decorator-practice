package mx.iteso;
/**
 * Abstract class of user.
 */
public abstract class User {
	/**
	 * Name string.
	 */
	private String name = "Any Name";
	/**
	 * Privileges string.
	 */
	private String privileges = " can ";
	/**
	 * @return string of the user name.
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return string of the privileges the user holds.
	 */
	public String getPrivileges() {
		return privileges;
	}
}
