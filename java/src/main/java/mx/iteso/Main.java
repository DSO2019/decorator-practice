package mx.iteso;

import mx.iteso.*;
import mx.iteso.privileges.*;

public class Main{

    public static void main(String[] args) {
     
        User user1 = new FinalUser();
        System.out.println(user1.print());

        user1 = new Approve(user1);
        user1 = new Publish(user1);
        user1 = new Delete(user1);
        user1 = new Comment(user1);

    }
}