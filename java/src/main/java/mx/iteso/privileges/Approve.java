package mx.iteso.privileges;

import mx.iteso.PrivilegeDecorator;
import mx.iteso.User;

public class Approve extends PrivilegeDecorator {

	private User user;
	
	public Approve(final User usuario) {
        this.user = usuario;
    }
	
	@Override
	public String getDesc() {
		return user.getDesc() + " approve ";
	}

	@Override
	public boolean canPublish() {
		return user.canPublish();
	}

	@Override
	public boolean canComment() {
		return user.canComment();
	}

	@Override
	public boolean canApprove() {
		return true;
	}

	@Override
	public boolean canDelete() {
		return user.canDelete();
	}

}
