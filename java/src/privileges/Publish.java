package privileges;

import decorator.PrivilegeDecorator;
import decorator.User;

public class Publish extends PrivilegeDecorator{
	User user;
	
	public Publish(User user) {
		this.user = user;
	}

	@Override
	public String getPrivileges() {
		return user.getPrivileges() + " publish";
	}

	@Override
	public String getName() {
		return user.getName();
	}
}
