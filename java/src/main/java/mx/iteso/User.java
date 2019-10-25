package mx.iteso;

public abstract class User {

	private String description = "user";
	
	
	public String getDesc() {
		return description;
	}
	
	public void setDesc(final String desc) {
		this.description = desc;
	}
	
    public abstract boolean canPublish();
    public abstract boolean canComment();
    public abstract boolean canApprove();
    public abstract boolean canDelete();

}

