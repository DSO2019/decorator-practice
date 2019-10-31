package mx.iteso.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import mx.iteso.User;
import mx.iteso.privileges.Approve;
import org.junit.Before;
import org.junit.Test;

/**
 * test class for approve permission.
 */
public class TestApprove {
    /**
     * Nuevo usuario para agregar permisos.
     */
    private User user;

    /**
     *
     */
    @Before
    public void setUp() {
        user = mock((User.class));
    }

    /**
     * Test aprobar.
     */
    @Test
    public void testCanApprove() {
        User approve = new Approve(user);
        when(user.canApprove()).thenReturn(false);
        boolean canApprove = approve.canApprove();
        assertTrue(canApprove);
    }

    /**
     * Descripcion Aprobar.
     */
    @Test
    public void testDescription() {
        User approve = new Approve(user);
        when(user.getDescription()).thenReturn("User with privileges: ");
        String desc = approve.getDescription();
        assertEquals("User with privileges: permiso de aprobar", desc);
    }
}
