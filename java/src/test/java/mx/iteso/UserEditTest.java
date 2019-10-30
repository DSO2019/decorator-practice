package mx.iteso;

import mx.iteso.privileges.Edit;
import mx.iteso.users.BaseUser;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class UserEditTest {
    private User user;
    @Before
    public void setUp() {
        user = new BaseUser();
    }
    @Test
    public void testApprovePermission() {
        assertFalse(user.approve());
    }
    @Test
    public void testEditPermission() {
        user = new Edit(user);
        assertTrue(this.user.edit());
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
