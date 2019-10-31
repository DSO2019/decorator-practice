using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace decoratorPatern.decorator
{
    public abstract class Privilege : User
    {
        /**
         * privilage to return on users.
         */
        public abstract String getPrivilege();      

    }
}
