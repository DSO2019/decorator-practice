using System;
using System.Collections.Generic;
using System.Text;
using decoratorPatern.Users;

namespace decoratorPatern.decorator
{
    class UserFinal
    {
        private static void Main(string[] args)
        {


            private User commenter = new Commenter();
        private User editor = new Editor();
        private User publisher = new Publisher();
        private User admin = new Admin();

        /**
         * admin approve privilege.
         */
        admin = new Approve(admin);


        /**
         * admin comment privilege.
         */
        admin = new Comment(admin);


        /**
         * admin delete privilege.
         */
        admin = new Delete(admin);

        /**
         * admin publish privilege.
         */
        admin = new Publish(admin);


        /**
         * editor approve privilege.
         */
        editor = new Approve(editor);

        /**
         * editor comment privilege.
         */
        editor = new Comment(editor);


        /**
         * editor publish privilege.
         */
        editor = new Publish(editor);


        /**
         * publisher publish privilege.
         */

        publisher = new Publish(Publisher);

        /**
         * prints user info.
         */
        System.out.println(basic.getName()  + basic.getPrivileges());

        /**
        * prints user info.
        */
        System.out.println(admin.getName() + admin.getPrivileges());

        /**
        * prints user info.
        */
        System.out.println(editor.getName() + editor.getPrivileges());

        /**
        * prints user info.
        */
        System.out.println(publisher.getName() + publisher.getPrivileges());


    }
}
}
