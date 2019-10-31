using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using decoratorPatern.decorator;

namespace decoratorPatern.Privileges
{
    public class Delete : User
    {

        /*
         * creates the user.
         */
        private User user;

        /**
         *  assign user to usertype.
         */
        public Delete(User us)
        {
            this.user = us;
        }

        override
        /**
         * return user privilege
         */
        public string getPrivilege()
        {
            return user.getPrivilege() + "delete";
        }

    }
}
