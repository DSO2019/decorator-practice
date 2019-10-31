package mx.iteso;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import mx.iteso.privileges.Delete;
import org.junit.Before;
import org.junit.Test;

/**
 * Class DeleteTest.
 */
public class DeleteTest {
    /**
     * User to be mocked.
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
    public void testDeletionPermission() {
        User delete = new Delete(user);
        when(user.deletePermission()).thenReturn(false);
        boolean deleteEnabled = delete.deletePermission();
        assertTrue(deleteEnabled);
    }

    /**
     * Test description.
     */
    @Test
    public void testDescription() {
        User delete = new Delete(user);
        when(user.getDescription()).thenReturn("Current user");
        String desc = delete.getDescription();
        System.out.println(desc);
        assertEquals("Delete permission to: Current user", desc);
    }
}
