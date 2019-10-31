namespace decorator_practice
{
    internal class FinalUser : User
    {
        override
        public string PublishM()
        {
            return "No tengo privilegios para publicar";
        }

        override
        public string DeleteM()
        {
            return "No tengo privilegios para borrar";
        }

        override
        public string ApproveM()
        {
            return "No tengo privilegios para aprobar";
        }

        override
        public string CommentM()
        {
            return "No tengo privilegios para comentar";
        }
    }
}
