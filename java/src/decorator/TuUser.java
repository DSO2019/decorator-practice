package decorator;

import Users.*;
import privileges.*;

public class TuUser {

	public static void main(String[] args) {
		User basic = new BasicUser();
		User admin = new AdminUser();		
		User editor = new EditorUser();
		User publisher = new PublisherUser();
		
		admin = new Approve(admin);
		admin = new Comment(admin);
		admin = new Delete(admin);
		admin = new Publish(admin);
		
		editor = new Approve(editor);
		editor = new Comment(editor);
		editor = new Publish(editor);
		
		publisher = new Publish(publisher);
		
		System.out.println(basic.getName()  + basic.getPrivileges());
		System.out.println(admin.getName() + admin.getPrivileges());
		System.out.println(editor.getName() + editor.getPrivileges());
		System.out.println(publisher.getName() + publisher.getPrivileges());
		
		

	}

}
