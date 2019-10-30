using System;
using System.Collections.Generic;
using System.Text;

namespace decorator_practice.main.decorator
{
    public abstract class PrivilegeDecorator : User
    {
        /**
	     * @return string of privileges.
	     */
        public abstract String getPrivileges();
        /**
	     * @return string of the user name.
	     */
        public abstract String getName();
    }
}
