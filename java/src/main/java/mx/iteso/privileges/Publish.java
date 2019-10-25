package mx.iteso.privileges;
import mx.iteso.User;

public class Publish extends User{
private User user;
	
	public Publish(final User usuario) {
        this.user = usuario;
    }
	
	@Override
	public String getDesc() {
		return user.getDesc() + " publish ";
	}

	@Override
	public boolean canPublish() {
		return true;
	}

	@Override
	public boolean canComment() {
		return user.canComment();
	}

	@Override
	public boolean canApprove() {
		return user.canApprove();
	}

	@Override
	public boolean canDelete() {
		return user.canDelete();
	}
}
