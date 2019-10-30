package mx.iteso;

import users.AdminUser;
import users.BasicUser;
import users.EditorUser;
import users.PublisherUser;
import privileges.Approve;
import privileges.Comment;
import privileges.Delete;
import privileges.Publish;

/**
 * Main class.
 */
public class TuUser {
	/**
	 * @param args Main method.
	 */
	private static void main(final String[] args) {
		/**
		 * Basic user.
		 */
		private User basic = new BasicUser();
		/**
		 * Admin user.
		 */
		private User admin = new AdminUser();
		/**
		 * Editor user.
		 */
		private User editor = new EditorUser();
		/**
		 * Publisher user.
		 */
		private User publisher = new PublisherUser();
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
		System.out.println(publisher.getName()
					+ publisher.getPrivileges());
	}
}
