package mx.iteso.privileges;

import mx.iteso.User;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class ApproveTest  {
    private User user;
    @Before
    public void setUp() {
        user = new FinalUser();
    }

    @Test
    public void testApprove() {
        assertEquals(user.approve(), "No privileges to approve");
        this.user = new Approve(this.user);
        assertEquals(user.approve(), "Can approve");
    }

}
