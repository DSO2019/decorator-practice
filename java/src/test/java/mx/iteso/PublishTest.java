package mx.iteso;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;

import mx.iteso.User;
import mx.iteso.privileges.Approve;
import mx.iteso.privileges.Publish;

public class PublishTest {
    private User user;
    
    @Before
    public void setUp(){
        user = mock((User.class));
    }
    @Test
    public void testPublish(){
        User publi = new Publish(user);
        when(user.canPublish()).thenReturn(false);
        boolean canPublish = publi.canPublish();
        assertTrue(canPublish);
    }
    @Test
    public void testDescription(){
        User publi = new Publish(user);
        when(user.getDesc()).thenReturn("User with privileges: ");
        String desc = publi.getDesc();
        assertEquals("User with privileges:  publish ", desc);
    }
}
