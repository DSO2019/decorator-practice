package privileges;

import decorator.PrivilegeDecorator;
import decorator.User;

public class Approve extends PrivilegeDecorator{
	User user;
	
	public Approve(User user) {
		this.user = user;
	}

	@Override
	public String getPrivileges() {
		return user.getPrivileges() + " approve";
	}

	@Override
	public String getName() {
		return user.getName();
	}
}
