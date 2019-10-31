namespace decorator_practice
{
    internal class Delete : PrivilegesDecorator
    {
        private readonly User _user;


        public Delete(User userIn)
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
            return "Puedo borrar";
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
