package mx.iteso;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

/** Deletion Test Class. */
public class DeletionTest {
    /** User to be mocked. */
    private User user;
    
    /** Setup mehtod. */
    @Before
    public void setUp(){
        user = mock((User.class));
    }

    /** Method that proves the deletion permission. */
    @Test
    public void testDeletionPermission(){
        User deletion = new Deletion(user);
        when(user.deletionPermission()).thenReturn(false);
        boolean deletionEnabled = deletion.deletionPermission();
        assertTrue(deletionEnabled);
    }

    /** Method that tests the description on deletion test. */
    @Test
    public void testDescription(){
        User deletion = new Deletion(user);
        when(user.getDescription()).thenReturn("Current user");
        String desc = deletion.getDescription();
        System.out.println(desc);
        assertEquals("Deletion permission to: Current user", desc);
    }
}
