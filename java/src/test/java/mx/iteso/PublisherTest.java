package mx.iteso;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

/** Publisher Test Class. */
public class PublisherTest {
    /** User to be mocked. */
    private User user;
    
    /** Setup mehtod. */
    @Before
    public void setUp(){
        user = mock((User.class));
    }

    /** Method that proves the publish permission. */
    @Test
    public void testPublishPermission(){
        User publisher = new Publisher(user);
        when(user.publishPermission()).thenReturn(false);
        boolean publisherEnabled = publisher.publishPermission();
        assertTrue(publisherEnabled);
    }

    /** Method that tests the description on publish test. */
    @Test
    public void testDescription(){
        User publisher = new Publisher(user);
        when(user.getDescription()).thenReturn("Current user");
        String desc = publisher.getDescription();
        assertEquals("Publisher: Current user", desc);
    }
}
