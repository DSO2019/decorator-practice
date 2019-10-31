namespace decorator_practice
{
    internal class Comment : PrivilegesDecorator
    {
        private readonly User _user;


        public Comment(User userIn)
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
            return _user.ApproveM();
        }

        override
        public string CommentM()
        {
            return "Can comment";
        }
    }
}
