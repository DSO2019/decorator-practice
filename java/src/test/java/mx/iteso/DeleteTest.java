package mx.iteso;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;

import mx.iteso.User;
import mx.iteso.privileges.Approve;
import mx.iteso.privileges.Delete;

public class DeleteTest {
    private User user;
    
    @Before
    public void setUp(){
        user = mock((User.class));
    }

    @Test
    public void testDelete(){
        User del = new Delete(user);
        when(user.canDelete()).thenReturn(false);
        boolean canDelete = del.canDelete();
        assertTrue(canDelete);
    }
    @Test
    public void testDescription(){
        User del = new Delete(user);
        when(user.getDesc()).thenReturn("User with privileges: ");
        String desc = del.getDesc();
        assertEquals("User with privileges:  delete ", desc);
    }
}