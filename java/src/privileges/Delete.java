package privileges;

import decorator.PrivilegeDecorator;
import decorator.User;

public class Delete extends PrivilegeDecorator {
	User user;
	
	public Delete(User user) {
		this.user = user;
	}

	@Override
	public String getPrivileges() {
		return user.getPrivileges() + " delete";
	}
	
	@Override
	public String getName() {
		return user.getName();
	}
	
	
}
