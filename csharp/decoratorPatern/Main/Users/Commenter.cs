using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using decoratorPatern.decorator;

namespace decoratorPatern.Users
{
    public class Commenter : User
    {
        /**
      * Creates commenter.
      **/
        public Commenter()
        {
            name = "Commenter";
        }
    }
}
