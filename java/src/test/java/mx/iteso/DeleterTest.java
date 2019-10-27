package mx.iteso;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

import mx.iteso.Deleter;

public class DeleterTest {
    private User user;

    @Before
    public void setUp() {
        user = mock((User.class));
    }

    /** Test de permiso de aprobación. */
    @Test
    public void testApprovePermission() {
        User deleter = new Deleter(this.user);
        when(this.user.approve()).thenReturn(false);
        assertFalse(deleter.approve());
    }

    /** Test de permiso para realizar comentarios. */
    @Test
    public void testCommenterPermission() {
        User deleter = new Deleter(this.user);
        when(this.user.comment()).thenReturn(false);
        assertFalse(deleter.comment());
    }
    /** Test de permiso para eliminar. */
    @Test
    public void testDeleterPermission() {
        User deleter = new Deleter(this.user);
        when(this.user.delete()).thenReturn(false);
        assertTrue(deleter.delete());
    }
    /** Test de permiso para publicar. */
    @Test
    public void testPublisherPermission() {
        User deleter = new Deleter(this.user);
        when(this.user.publish()).thenReturn(false);
        assertFalse(deleter.publish());
    }
    /** Test de la descripción del usuario. */
    @Test
    public void testDescription() {
        User deleter = new Deleter(user);
        when(user.getDescription()).thenReturn("User >");
        assertEquals("User > Can delete", deleter.getDescription());
    }
}