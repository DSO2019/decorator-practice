package mx.iteso;

import mx.iteso.privileges.Approve;
import mx.iteso.privileges.Comment;
import mx.iteso.privileges.Delete;
import mx.iteso.privileges.Publish;
import mx.iteso.users.EndUser;

/**
 * Created by Maggie Jauregui on 10/25/19.
 */
public final class MyUsers {

    /**
     * Class constructor.
     */
    private MyUsers() {

    }

    /**
     * Main method to run.
     * @param args input args.
     */
    public static void main(final String[] args) {
        String adminPermissions;

        //Admin user
        EndUser admin = new EndUser("Administrator");

        //Creating permissions for Admin
        Comment adminComment = new Comment(admin);
        Approve adminAprrove = new Approve(admin);
        Delete adminDelete = new Delete(admin);
        Publish adminPublish = new Publish(admin);

        //Giving permissions to Admin
        admin.setPublish(adminPublish.publish());
        admin.setComment(adminComment.comment());
        admin.setDelete(adminDelete.delete());
        admin.setApprove(adminAprrove.approve());

        System.out.println(admin.getName() + " " + admin.getApprove());
        System.out.println(admin.getName() + " " + admin.getDelete());
        System.out.println(admin.getName() + " " + admin.getComment());
        System.out.println(admin.getName() + " " + admin.getPublish());



        //Publisher user
        EndUser publisher = new EndUser("Publisher");

        //Creating permissions for Publisher
        Approve publisherAprrove = new Approve(publisher);
        Publish publisherPublish = new Publish(publisher);

        //Giving permissions to Publisher
        publisher.setPublish(publisherPublish.publish());
        publisher.setApprove(publisherAprrove.approve());

        System.out.println(publisher.getName() + " " + publisher.getApprove());
        System.out.println(publisher.getName() + " " + publisher.getDelete());
        System.out.println(publisher.getName() + " " + publisher.getPublish());
        System.out.println(publisher.getName() + " " + publisher.getComment());



        //Editor user
        EndUser editor = new EndUser("Editor");

        //Creating permissions for Editor
        Comment editorComment = new Comment(editor);
        Publish editorPublish = new Publish(editor);

        //Giving permissions to Editor
        editor.setPublish(editorPublish.publish());
        editor.setComment(editorComment.comment());

        System.out.println(editor.getName() + " " + editor.getApprove());
        System.out.println(editor.getName() + " " + editor.getDelete());
        System.out.println(editor.getName() + " " + editor.getComment());
        System.out.println(editor.getName() + " " + editor.getPublish());



    }


}
