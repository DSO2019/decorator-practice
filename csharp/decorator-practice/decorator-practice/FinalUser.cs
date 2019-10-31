namespace decorator_practice
{
    internal class FinalUser : User
    {
        override
        public string PublishM()
        {
            return "No privileges to publish";
        }

        override
        public string DeleteM()
        {
            return "No privileges to delete";
        }

        override
            public string ApproveM()
        {
            return "No privileges to approve";
        }

        override
        public string CommentM()
        {
            return "No privileges to comment";
        }
    }
}
