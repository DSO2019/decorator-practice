package mx.iteso;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import mx.iteso.privileges.Publish;
import org.junit.Before;
import org.junit.Test;

/**
 * Class PublishTest
 */
public class PublishTest {
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
     * Test Permission.
     */
    @Test
    public void testPublishPermission() {
        User publish = new Publish(user);
        when(user.publishPermission()).thenReturn(false);
        boolean publishAdded = publish.publishPermission();
        assertTrue(publishAdded);
    }

    /**
     * Test Description.
     */
    @Test
    public void testDescription() {
        User publish = new Publish(user);
        when(user.getDescription()).thenReturn("Current user");
        String desc = publish.getDescription();
        assertEquals("Publish: Current user", desc);
    }
}
