package mx.iteso.test;

import mx.iteso.User;
import mx.iteso.privileges.Delete;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
/**
 * test class for delete permission.
 */
public class TestDelete {
    /**
     * User to test class.
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
     * test class for Eliminar permission.
     */
    @Test
    public void testCanDelete() {
        User deleter = new Delete(user);
        when(user.canDelete()).thenReturn(false);
        boolean canDelete = deleter.canDelete();
        assertTrue(canDelete);
    }
    /**
     * Descripcion Eliminar.
     */
    @Test
    public void testDescription() {
        User deleter = new Delete(user);
        when(user.getDescription()).thenReturn("User with privileges: ");
        String desc = deleter.getDescription();
        assertEquals("User with privileges: permiso de eliminar", desc);
    }
}
