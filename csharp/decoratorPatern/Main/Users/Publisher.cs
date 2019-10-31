using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using decoratorPatern.decorator;
using decoratorPatern.decorator;

namespace decoratorPatern.Users
{
    public class Publisher : User
    {
        /**
      * Creates publisher.
      **/
        public Publisher()
        {
            name = "Publisher";
        }   
    }
}
