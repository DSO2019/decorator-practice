package mx.iteso;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

/**
 * test class for delete permission.
 */
public class TestDelete {
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
     * Can delete test.
     */
    @Test
    public void testCanDelete() {
        User deleter = new Delete(user);
        when(user.canDelete()).thenReturn(false);
        boolean canDelete = deleter.canDelete();
        assertTrue(canDelete);
    }

    /**
     * Testing actual user description.
     */
    @Test
    public void testDescription() {
        User deleter = new Delete(user);
        when(user.getDescription()).thenReturn("Usuario con privilegios: ");
        String desc = approver.getDescription();
        assertEquals("Usuario con privilegios:", desc);
    }
}
