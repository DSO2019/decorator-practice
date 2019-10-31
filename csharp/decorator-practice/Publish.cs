using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace decorator_practice
{
    internal class Publish : PrivilegesDecorator
    {
        private readonly User _user;


        public Publish(User userIn)
        {
            _user = userIn;
        }

        override
        public string PublishM()
        {
            return "Puedo publicar";
        }

        override
        public string DeleteM()
        {
            return _user.DeleteM();
        }

        override
        public string ApproveM()
        {
            return _user.ApproveM();
        }

        override
        public string CommentM()
        {
            return _user.CommentM();
        }
    }
}
