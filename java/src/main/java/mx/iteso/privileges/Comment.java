package mx.iteso;

import decorator.PrivilegeDecorator;
import decorator.User;

/**
 * Comment privilege class.
 */
public class Comment extends PrivilegeDecorator {
	/**
	 * User.
	 */
	private User user;

	/**
	 * @param u constructor.
	 */
	public Comment(final User u) {
		this.user = u;
	}

	/**
	 * @return comment privilege.
	 */
	@Override
	public String getPrivileges() {
		return user.getPrivileges() + " comment";
	}

	/**
	 * @return name.
	 */
	@Override
	public String getName() {
		return user.getName();
	}
}
