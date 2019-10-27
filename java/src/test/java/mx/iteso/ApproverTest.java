package mx.iteso;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

import mx.iteso.Approver;

public class ApproverTest {
    private User user;

    @Before
    public void setUp() {
        user = mock((User.class));
    }

    /** Test de permiso de aprobación. */
    @Test
    public void testApprovePermission() {
        User approval = new Approver(this.user);
        when(this.user.approve()).thenReturn(false);
        assertTrue(approval.approve());
    }

    /** Test de permiso para realizar comentarios. */
    @Test
    public void testCommenterPermission() {
        User approval = new Approver(this.user);
        when(this.user.comment()).thenReturn(false);
        assertFalse(approval.comment());
    }
    /** Test de permiso para eliminar. */
    @Test
    public void testDeleterPermission() {
        User approval = new Approver(this.user);
        when(this.user.delete()).thenReturn(false);
        assertFalse(approval.delete());
    }
    /** Test de permiso para publicar. */
    @Test
    public void testPublisherPermission() {
        User approval = new Approver(this.user);
        when(this.user.publish()).thenReturn(false);
        assertFalse(approval.publish());
    }
    /** Test de la descripción del usuario. */
    @Test
    public void testDescription() {
        User approval = new Approver(user);
        when(user.getDescription()).thenReturn("User >");
        assertEquals("User > Can approve", approval.getDescription());
    }
}