package mx.iteso.privileges;

import mx.iteso.Privilege;
import mx.iteso.User;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Publish  {
    private User user;


    @Before
    public void setUp() {
        user = new FinalUser();
    }

    @Test
    public void testPublish() {
        assertEquals(user.publish(), "No privileges to publish";
        this.user = new Publish(this.user);
        assertEquals(user.publish(), "Can Publish");
    }

}
