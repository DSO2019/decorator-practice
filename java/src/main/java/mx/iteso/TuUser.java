package mx.iteso;

import mx.iteso.privileges.Approver;
import mx.iteso.privileges.Deleter;
import mx.iteso.privileges.Editor;
import mx.iteso.privileges.Publisher;
import mx.iteso.users.UserBase;


public class TuUser {
    public static void main(String[] args){
        User user = new UserBase();
        System.out.println(user.getDescription());
        System.out.println("Publish: " + user.publish() + " | Deletes: " + user.delete()
        + "\nApproves: " + user.approve() + " | Edits:" + user.edit());
        user = new Approver(user);
        //user = new Publisher(user);
        user = new Deleter(user);
        user = new Editor(user);

        System.out.println(user.getDescription());
        System.out.println("Publish: " + user.publish() + " | Deletes: " + user.delete()
        + "\nApproves: " + user.approve() + " | Edits:" + user.edit());
    }
}
