package mx.iteso;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

import mx.iteso.Commenter;

public class CommenterTest {
    private User user;

    @Before
    public void setUp() {
        user = mock((User.class));
    }

    /** Test de permiso de aprobación. */
    @Test
    public void testApprovePermission() {
        User commenter = new Commenter(this.user);
        when(this.user.approve()).thenReturn(false);
        assertFalse(commenter.approve());
    }

    /** Test de permiso para realizar comentarios. */
    @Test
    public void testCommenterPermission() {
        User commenter = new Commenter(this.user);
        when(this.user.comment()).thenReturn(false);
        assertTrue(commenter.comment());
    }
    /** Test de permiso para eliminar. */
    @Test
    public void testDeleterPermission() {
        User commenter = new Commenter(this.user);
        when(this.user.delete()).thenReturn(false);
        assertFalse(commenter.delete());
    }
    /** Test de permiso para publicar. */
    @Test
    public void testPublisherPermission() {
        User commenter = new Commenter(this.user);
        when(this.user.publish()).thenReturn(false);
        assertFalse(commenter.publish());
    }
    /** Test de la descripción del usuario. */
    @Test
    public void testDescription() {
        User commenter = new Commenter(user);
        when(user.getDescription()).thenReturn("User >");
        assertEquals("User > Can comment", commenter.getDescription());
    }
}