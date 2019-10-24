package mx.iteso;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

import mx.iteso.privileges.Publish;

public class PublishTest {
    private User user;
    
    @Before
    public void setUp(){
        user = mock((User.class));
    }

    @Test
    public void testCanPublish(){
        User publisher = new Publish(user);
        when(user.canPublish()).thenReturn(false);
        boolean canPublish = publisher.canPublish();
        assertTrue(canPublish);
    }

    @Test
    public void testDescription(){
        User publisher = new Publish(user);
        when(user.getDescription()).thenReturn("User with privileges: ");
        String desc = publisher.getDescription();
        assertEquals("User with privileges: publish ", desc);
    }
}