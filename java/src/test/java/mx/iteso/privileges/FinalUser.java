package mx.iteso;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FinalUserTest {
    private User user;

    @Before
    public void setUp() {
        user = new FinalUser();
    }

    @Test
    public void testFinalUser() {
        assertEquals(user.delete(), "No privileges to comment to delete");
        assertEquals(user.publish(), "No privileges to comment to publish");
        assertEquals(user.comment(), "No privileges to comment to comment");
        assertEquals(user.approve(), "No privileges to comment to approve");
        this.user = new Delete(this.user);
        assertEquals(user.delete(), "Can delete");
        this.user = new Publish(this.user);
        assertEquals(user.publish(), "Can publish");
        this.user = new Comment(this.user);
        assertEquals(user.comment(), "Can comment");
        this.user = new Approve(this.user);
        assertEquals(user.approve(), "Can approve");
    }

}