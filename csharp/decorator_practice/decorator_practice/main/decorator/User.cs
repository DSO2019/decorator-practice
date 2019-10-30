using System;
using System.Collections.Generic;
using System.Text;

namespace decorator_practice.main.decorator
{
    public abstract class User
    {
        /**
         * Name string.
         */
        public String name = "Any Name";
        /**
         * Privileges string.
         */
        public String privileges = " can ";
        /**
         * @return string of the user name.
         */
        public String getName()
        {
            return name;
        }
        /**
         * @return string of the privileges the user holds.
         */
        public String getPrivileges()
        {
            return privileges;
        }
    }
}
