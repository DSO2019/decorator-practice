package mx.iteso;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;

import mx.iteso.User;
import mx.iteso.privileges.Approve;

public class ApproveTest {
    private User user;
    
    @Before
    public void setUp(){
        user = mock((User.class));
    }
    @Test
    public void testApprove(){
        User ap = new Approve(user);
        when(user.canApprove()).thenReturn(false);
        boolean canApprove = ap.canApprove();
        assertTrue(canApprove);
    }
    @Test
    public void testDescription(){
        User ap = new Approve(user);
        when(user.getDesc()).thenReturn("User with privileges: ");
        String desc = ap.getDesc();
        assertEquals("User with privileges: approve ", desc);
    }
}