package mx.iteso;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

import mx.iteso.privileges.Delete;

public class DeleteTest {
    private User user;
    
    @Before
    public void setUp(){
        user = mock((User.class));
    }

    @Test
    public void testCanDelete(){
        User deleter = new Delete(user);
        when(user.canDelete()).thenReturn(false);
        boolean canDelete = deleter.canDelete();
        assertTrue(canDelete);
    }

    @Test
    public void testDescription(){
        User deleter = new Delete(user);
        when(user.getDescription()).thenReturn("User with privileges: ");
        String desc = deleter.getDescription();
        assertEquals("User with privileges: delete ", desc);
    }
}