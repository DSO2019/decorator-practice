package mx.iteso;

import mx.iteso.privileges.Approve;
import mx.iteso.privileges.Comment;
import mx.iteso.privileges.Delete;
import mx.iteso.privileges.Publish;
import mx.iteso.users.EndUser;

import java.net.PortUnreachableException;

public class MyUsers {

    public static void main(String[] args) {
        String adminPermissions;

        //Admin user
        EndUser admin = new EndUser("Administrator");

        //Creating permissions for Admin
        Comment adminComment = new Comment(admin);
        Approve adminAprrove = new Approve(admin);
        Delete adminDelete = new Delete(admin);
        Publish adminPublish = new Publish(admin);

        //Giving permissions to Admin
        admin.publishPermission = adminPublish.publish();
        admin.commentPermission = adminComment.comment();
        admin.deletePermission = adminDelete.delete();
        admin.approvePermission = adminAprrove.approve();

        System.out.println(admin.name + " " + admin.approvePermission);
        System.out.println(admin.name + " " + admin.deletePermission);
        System.out.println(admin.name + " " + admin.publishPermission);
        System.out.println(admin.name + " " + admin.commentPermission);



        //Publisher user
        EndUser publisher = new EndUser("Publisher");

        //Creating permissions for Publisher
        Approve publisherAprrove = new Approve(publisher);
        Publish publisherPublish = new Publish(publisher);

        //Giving permissions to Publisher
        publisher.publishPermission = publisherPublish.publish();
        publisher.approvePermission = publisherAprrove.approve();

        System.out.println(publisher.name + " " + publisher.approvePermission);
        System.out.println(publisher.name + " " + publisher.deletePermission);
        System.out.println(publisher.name + " " + publisher.publishPermission);
        System.out.println(publisher.name + " " + publisher.commentPermission);



        //Editor user
        EndUser editor = new EndUser("Editor");

        //Creating permissions for Editor
        Comment editorComment = new Comment(editor);
        Publish editorPublish = new Publish(editor);

        //Giving permissions to Editor
        editor.publishPermission = editorPublish.publish();
        editor.commentPermission = editorComment.comment();

        System.out.println(editor.name + " " + editor.approvePermission);
        System.out.println(editor.name + " " + editor.deletePermission);
        System.out.println(editor.name + " " + editor.publishPermission);
        System.out.println(editor.name + " " + editor.commentPermission);



    }


}
