package mx.iteso;

import mx.iteso.Approver;
import mx.iteso.Deleter;
import mx.iteso.Commenter;
import mx.iteso.Publisher;
import mx.iteso.UserBase;


public class TuUser {
    public static void main(String[] args){
        User user = new UserBase();
        System.out.println(user.getDescription());
        System.out.println("Publish: " + user.publish() + " | Deletes: " + user.delete()
        + "\nApproves: " + user.approve() + " | Edits:" + user.comment());
        user = new Approver(user);
        user = new Publisher(user);
        user = new Deleter(user);
        user = new Commenter(user);

        System.out.println(user.getDescription());
        System.out.println("Publish: " + user.publish() + " | Deletes: " + user.delete()
        + "\nApproves: " + user.approve() + " | Edits:" + user.comment());
    }
}
