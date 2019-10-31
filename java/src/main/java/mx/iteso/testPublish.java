package mx.iteso;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.junit.Before;
import org.junit.Test;

/**
 * test class for publish permission.
 */
public class TestPublish {
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
     * Can publish test.
     */
    @Test
    public void testCanPublish() {
        User publisher = new Publish(user);
        when(user.canPublish()).thenReturn(false);
        boolean canPublish = publisher.canPublish();
        assertTrue(canPublish);
    }

    /**
     * Testing actual user description.
     */
    @Test
    public void testDescription() {
        User publisher = new Publish(user);
        when(user.getDescription()).thenReturn("Usuario con privilegio: ");
        String descripcion = publisher.getDescription();
        assertEquals("Usuario con privilegio: ", descripcion);
    }

}
