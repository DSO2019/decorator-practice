package mx.iteso;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

/**
 * test class for approve permission.
 */
public class TestApprove {
    /**
     * creating user for testing.
     */
    private User user;

    /**
     * setting mocked object up.
     */
    @Before
    public void setUp() {
        user = mock((User.class));
    }

    /**
     * Can approve test.
     */
    @Test
    public void testCanApprove() {
        User approver = new Approve(user);
        when(user.canApprove()).thenReturn(false);
        boolean canApprove = approver.canApprove();
        assertTrue(canApprove);
    }

    /**
     * Testing actual user description.
     */
    @Test
    public void testDescription() {
        User approver = new Approve(user);
        when(user.getDescription()).thenReturn("User with privileges: ");
        String desc = approver.getDescription();
        assertEquals("User with privileges: approve ", desc);
    }
}
