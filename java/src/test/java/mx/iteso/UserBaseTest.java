package mx.iteso;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Before;
import org.junit.Test;

import mx.iteso.UserBase;

public class UserBaseTest {
    private User user;

    @Before
    public void setUp() {
        user = new UserBase();
    }

    /** Test de permiso de aprobación. */
    @Test
    public void testApprovePermission() {
        
        assertFalse(this.user.approve());
    }

    /** Test de permiso para realizar comentarios. */
    @Test
    public void testCommenterPermission() {
        assertFalse(this.user.comment());
    }
    /** Test de permiso para eliminar. */
    @Test
    public void testDeleterPermission() {
        assertFalse(this.user.delete());
    }
    /** Test de permiso para publicar. */
    @Test
    public void testPublisherPermission() {
        assertFalse(this.user.publish());
    }
    /** Test de la descripción del usuario. */
    @Test
    public void testDescription() {
        assertEquals("User >", this.user.getDescription());
    }
}