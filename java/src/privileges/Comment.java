package privileges;

import decorator.PrivilegeDecorator;
import decorator.User;

public class Comment extends PrivilegeDecorator{
	User user;
	
	public Comment(User user) {
		this.user = user;
	}

	@Override
	public String getPrivileges() {
		return user.getPrivileges() + " comment";
	}
	
	@Override
	public String getName() {
		return user.getName();
	}
}
