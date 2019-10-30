package mx.iteso;

import mx.iteso.users.BaseUser;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class BaseUserTest {
    private User user;

    @Before
    public void setUp() {
        user = new BaseUser();
    }
    @Test
    public void testApprovePermission() {

        assertFalse(this.user.approve());
    }
    @Test
    public void testEditPermission() {
        assertFalse(this.user.edit());
    }
    @Test
    public void testDeleterPermission() {
        assertFalse(this.user.delete());
    }
    @Test
    public void testPublisherPermission() {
        assertFalse(this.user.publish());
    }
}
