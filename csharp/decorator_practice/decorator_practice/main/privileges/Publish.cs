using decorator_practice.main.decorator;
using System;
using System.Collections.Generic;
using System.Text;

namespace decorator_practice.main.privileges
{
    public class Publish : PrivilegeDecorator
    {
        /**
	     * User.
	     */
        private User user;

        /**
	     * @param u constructor.
	     */
        public Publish(User u)
        {
            this.user = u;
        }

        /**
	     * @return approve privilege.
	     */
        override
        public String getPrivileges()
        {
            return user.getPrivileges() + " publish";
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
