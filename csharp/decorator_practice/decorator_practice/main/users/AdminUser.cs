using decorator_practice.main.decorator;
using System;
using System.Collections.Generic;
using System.Text;

namespace decorator_practice.main.users
{
    public class AdminUser : User
    {
        /**
	     * Constructor.
	     */
        public AdminUser()
        {
                name = "Admin";
        }
    }
}
