package mx.iteso;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

import mx.iteso.Publisher;

public class PublisherTest {
    private User user;

    @Before
    public void setUp() {
        user = mock((User.class));
    }

    /** Test de permiso de aprobación. */
    @Test
    public void testApprovePermission() {
        User publisher = new Publisher(this.user);
        when(this.user.approve()).thenReturn(false);
        assertFalse(publisher.approve());
    }

    /** Test de permiso para realizar comentarios. */
    @Test
    public void testCommenterPermission() {
        User publisher = new Publisher(this.user);
        when(this.user.comment()).thenReturn(false);
        assertFalse(publisher.comment());
    }
    /** Test de permiso para eliminar. */
    @Test
    public void testDeleterPermission() {
        User publisher = new Publisher(this.user);
        when(this.user.delete()).thenReturn(false);
        assertFalse(publisher.delete());
    }
    /** Test de permiso para publicar. */
    @Test
    public void testPublisherPermission() {
        User publisher = new Publisher(this.user);
        when(this.user.publish()).thenReturn(false);
        assertTrue(publisher.publish());
    }
    /** Test de la descripción del usuario. */
    @Test
    public void testDescription() {
        User publisher = new Publisher(user);
        when(user.getDescription()).thenReturn("User >");
        assertEquals("User > Can publish", publisher.getDescription());
    }
}