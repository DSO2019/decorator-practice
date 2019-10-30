package mx.iteso;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.Assert.Equals;
import static org.junit.Assert.assertTrue;
import static org.junit.Before;
import static org.junit.Test;

/**
 * Basic user test class.
 */
public class BasicUserTest {
    private User user;

    /**
     * Set up method.
     */
    @Before
    public void SetUp(){
        user = mock((BasicUser.class));
    }    
    /**
     * Get name test.
     */
    @Test
    public void NameTest(){
        when(user.getName()).thenReturn("Basic User");
    }
}
