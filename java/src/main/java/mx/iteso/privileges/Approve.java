package mx.iteso;

import decorator.PrivilegeDecorator;
import decorator.User;

/**
 * Approve privilege class.
 */
public class Approve extends PrivilegeDecorator {
	/**
	 * User.
	 */
	private User user;

	/**
	 * @param u constructor.
	 */
	public Approve(final User u) {
		this.user = u;
	}

	/**
	 * @return approve privilege.
	 */
	@Override
	public String getPrivileges() {
		return user.getPrivileges() + " approve";
	}

	/**
	 * @return name.
	 */
	@Override
	public String getName() {
		return user.getName();
	}
}
