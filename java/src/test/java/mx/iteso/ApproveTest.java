package mx.iteso;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import mx.iteso.privileges.Approve;
import org.junit.Before;
import org.junit.Test;

/**
 * Class ApproveTest.
 */
public class ApproveTest {

    /**
     * User.
     */
    private User user;

    /**
     * Setup.
     */
    @Before
    public void setUp() {
        user = mock((User.class));
    }

    /**
     * Test permission.
     */
    @Test
    public void testApprovePermission() {
        User approve = new Approve(user);

        when(user.approvePermission()).thenReturn(false);
        boolean approveActive = approve.approvePermission();

        assertTrue(approveActive);
    }

    /**
     * Test description.
     */
    @Test
    public void testDescription() {
        User approve = new Approve(user);

        when(user.getDescription()).thenReturn("Current user");
        String description = approve.getDescription();

        assertEquals("Approve permission to: Current user", description);
    }
}
