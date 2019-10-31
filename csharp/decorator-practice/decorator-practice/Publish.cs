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
            return "Can publish";
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
