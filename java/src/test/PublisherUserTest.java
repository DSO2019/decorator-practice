package mx.iteso;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.Assert.Equals;
import static org.junit.Assert.assertTrue;
import static org.junit.Before;
import static org.junit.Test;

/**
 * Publisher user test class.
 */
public class PublisherUserTest {
    private User user;

    /**
     * Set up method.
     */
    @Before
    public void SetUp(){
        user = mock((PublisherUser.class));
    }    
    /**
     * Get name test.
     */
    @Test
    public void NameTest(){
        when(user.getName()).thenReturn("Publisher");
    }
}
