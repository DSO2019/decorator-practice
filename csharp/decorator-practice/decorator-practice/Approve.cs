﻿namespace decorator_practice
{
    internal class Approve : PrivilegesDecorator
    {
        private readonly User _user;


        public Approve(User userIn)
        {
            _user = userIn;
        }

        override
        public string PublishM()
        {
            return _user.PublishM();
        }

        override
        public string DeleteM()
        {
            return _user.DeleteM();
        }

        override 
        public string ApproveM()
        {
            return "Can approve";
        }

        override
        public string CommentM()
        {
            return _user.CommentM();
        }
    }
}
