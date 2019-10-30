using decorator_practice.main.decorator;
using System;
using System.Collections.Generic;
using System.Text;

namespace decorator_practice.main.privileges
{
    public class Comment : PrivilegeDecorator
    {
        /**
	     * User.
	     */
        private User user;

        /**
	     * @param u constructor.
	     */
        public Comment(User u)
        {
            this.user = u;
        }

        /**
	     * @return approve privilege.
	     */
        override
        public String getPrivileges()
        {
            return user.getPrivileges() + " comment";
        }

        /**
	     * @return name.
	     */
        override
        public String getName()
        {
            return user.getName();
        }
    }
}
