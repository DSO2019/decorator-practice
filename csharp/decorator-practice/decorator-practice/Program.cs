using System;

namespace decorator_practice
{
    internal class Program
    {
        private static void Main()
        {
            User admin = new FinalUser();
            Console.WriteLine(admin.ApproveM());
            Console.WriteLine(admin.PublishM());
            Console.WriteLine(admin.DeleteM());
            Console.WriteLine(admin.CommentM());
            Console.WriteLine();

            admin = new Approve(admin);
            Console.WriteLine(admin.ApproveM());
            Console.WriteLine(admin.PublishM());
            Console.WriteLine(admin.DeleteM());
            Console.WriteLine(admin.CommentM());
            Console.WriteLine();

            admin = new Comment(admin);
            Console.WriteLine(admin.ApproveM());
            Console.WriteLine(admin.PublishM());
            Console.WriteLine(admin.DeleteM());
            Console.WriteLine(admin.CommentM());
            Console.WriteLine();

            admin = new Publish(admin);
            Console.WriteLine(admin.ApproveM());
            Console.WriteLine(admin.PublishM());
            Console.WriteLine(admin.DeleteM());
            Console.WriteLine(admin.CommentM());
            Console.WriteLine();

            admin = new Delete(admin);
            Console.WriteLine(admin.ApproveM());
            Console.WriteLine(admin.PublishM());
            Console.WriteLine(admin.DeleteM());
            Console.WriteLine(admin.CommentM());
            Console.WriteLine();
        }
    }
}
