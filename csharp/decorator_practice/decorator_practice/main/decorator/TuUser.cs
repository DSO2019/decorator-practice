using decorator_practice.main.users;
using DocumentFormat.OpenXml.Bibliography;
using System;
using System.Collections.Generic;
using System.Text;

namespace decorator_practice.main.decorator
{

    class TuUser
    {
        private static void Main(string[] args) { 
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
            publisher = new Publish(Publisher);
            System.out.println(basic.getName()  + basic.getPrivileges());
            System.out.println(admin.getName() + admin.getPrivileges());
            System.out.println(editor.getName() + editor.getPrivileges());
            System.out.println(publisher.getName() + publisher.getPrivileges());

        }
    }       
}
    
    



