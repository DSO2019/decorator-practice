package mx.iteso;

import decorator.PrivilegeDecorator;
import decorator.User;

/**
 * Publish privilege class.
 */
public class Publish extends PrivilegeDecorator {
	/**
	 * User.
	 */
	private User user;

	/**
	 * @param u constructor.
	 */
	public Publish(final User u) {
		this.user = u;
	}

	/**
	 * @return publish privilege.
	 */
	@Override
	public String getPrivileges() {
		return user.getPrivileges() + " publish";
	}

	/**
	 * @return name.
	 */
	@Override
	public String getName() {
		return user.getName();
	}
}
