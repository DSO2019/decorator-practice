package decorator;
public abstract class User {
	public String name = "Any Name";
	public String privileges = " can ";

	public String getName() {
		return name;
	}
	
	public String getPrivileges() {
		return privileges;
	}
}
