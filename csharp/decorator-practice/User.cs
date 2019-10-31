using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace decorator_practice
{
    internal abstract class User
    {
        public abstract string PublishM();

        public abstract string DeleteM();

        public abstract string ApproveM();

        public abstract string CommentM();
    }
}
