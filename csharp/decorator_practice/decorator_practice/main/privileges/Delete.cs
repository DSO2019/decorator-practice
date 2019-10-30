using decorator_practice.main.decorator;
using System;
using System.Collections.Generic;
using System.Text;

namespace decorator_practice.main.privileges
{
    public class Delete : PrivilegeDecorator
    {
        /**
	     * User.
	     */
        private User user;

        /**
	     * @param u constructor.
	     */
        public Delete(User u)
        {
            this.user = u;
        }

        /**
	     * @return approve privilege.
	     */
        override
        public String getPrivileges()
        {
            return user.getPrivileges() + " delete";
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
