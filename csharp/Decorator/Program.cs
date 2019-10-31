using System;

namespace Decorator
{
    internal class Program
    {
        private static void Main()
        {
            var cliente = new Cliente();
            var admin = new FinalUser();
            Console.WriteLine();
            var approve = new Approve(admin);
            var comment = new Comment(approve);
            var delete = new Delete(comment);
            var publish = new Publish(delete);
            Console.WriteLine("Admin: \n");
            cliente.ClienteCode(publish);
            
            var editor = new FinalUser();
            var comment2 = new Comment(editor);
            var delete2 = new Delete(comment2);
            Console.WriteLine("Editor: \n");
            cliente.ClienteCode(delete2);

            var publicador = new FinalUser();
            var comment3 = new Comment(publicador);
            var delete3 = new Delete(comment3);
            var publish3 = new Publish(delete3);
            Console.WriteLine("Publicador: \n");
            cliente.ClienteCode(publish3);

            
        }

    }

    public abstract class User
    {
        public abstract string GetDescription();
    }

    public class FinalUser: User
    {
        private const string Description = "";

        public override string GetDescription()
        {
            return Description;
        }
    }

    public abstract class PrivilegesDecorator:User
    {
        protected User User;

        protected PrivilegesDecorator(User user)
        {
            User = user;
        }

        public override string GetDescription() {
            
            return User.GetDescription();
            
        }
    }

    internal class Approve: PrivilegesDecorator
    {
        public Approve(User usuario): base(usuario)
        {
        }

        public override string GetDescription()
        {
            return $"{base.GetDescription()} Con permiso para aprobar\n";
        }
    }

    public class Comment: PrivilegesDecorator
    {
        public Comment(User usuario) : base(usuario)
        {
        }

        public override string GetDescription()
        {
            return $"{base.GetDescription()} Con permiso para comentar\n";
        }
    }

    public class Delete : PrivilegesDecorator
    {
        public Delete(User usuario) : base(usuario)
        {
        }

        public override string GetDescription()
        {
            return $"{base.GetDescription()} Con permiso para borrar\n";
        }
    }

    public class Publish : PrivilegesDecorator
    {
        public Publish(User usuario) : base(usuario)
        {
        }

        public override string GetDescription()
        {
            return $"{base.GetDescription()} Con permiso para publicar\n";
        }
    }

    public class Cliente
    {

        public void ClienteCode(User user)
        {
            Console.WriteLine(user.GetDescription());
        }

    }

}
