package mx.iteso.test;

import mx.iteso.User;
import mx.iteso.privileges.Publish;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
/**
 * test class for publish permission.
 */
public class TestPublish {
    /**
     * Nuevo usuario para agregar permisos.
     */
    private User user;
    /**
     * Nuevo usuario para agregar permisos.
     */
    @Before
    public void setUp() {
        user = mock((User.class));
    }
    /**
     * test class for publish permission.
     */
    @Test
    public void testCanPublish() {
        User publisher = new Publish(user);
        when(user.canPublish()).thenReturn(false);
        boolean canPublish = publisher.canPublish();
        assertTrue(canPublish);
    }
    /**
     * Descripcion publicar.
     */
    @Test
    public void testDescription() {
        User publisher = new Publish(user);
        when(user.getDescription()).thenReturn("User with privileges: ");
        String desc = publisher.getDescription();
        assertEquals("User with privileges: permiso de publicar", desc);
    }
}
