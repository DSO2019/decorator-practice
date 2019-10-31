using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using decoratorPatern.Users;

namespace decoratorPatern.decorator
{
   public abstract class User
    {
        /**
         * user name, will be overrided.
         */
        public String name = "Nombre";

        /**
         * used when privilages are returned.
         */
        public string privileges = " puede ";

        /**
         * returns name.
         */
        public string getName()
        {
            return name;
        }

        /**
         * return privileges.
         */
        public string getPrivilege()
        {
            return privileges;
        }
    }
}
