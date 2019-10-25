package mx.iteso;

public class FinalUser extends User {
	
	public FinalUser() {
	 setDesc("User with the following privileges: ");
	    }

	@Override
	public boolean canPublish() {
		return false;
	}

	@Override
	public boolean canComment() {
		return false;
	}

	@Override
	public boolean canApprove() {
		return false;
	}

	@Override
	public boolean canDelete() {
		return false;
	}

}
