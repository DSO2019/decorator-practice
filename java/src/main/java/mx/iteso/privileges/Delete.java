package mx.iteso;

import decorator.PrivilegeDecorator;
import decorator.User;

/**
 * Delete privilege class.
 */
public class Delete extends PrivilegeDecorator {
	/**
	 * User.
	 */
	private User user;

	/**
	 * @param u constructor.
	 */
	public Delete(final User u) {
		this.user = u;
	}

	/**
	 * @return delete privilege.
	 */
	@Override
	public String getPrivileges() {
		return user.getPrivileges() + " delete";
	}

	/**
	 * @return name.
	 */
	@Override
	public String getName() {
		return user.getName();
	}
}
