package mx.iteso;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.Assert.Equals;
import static org.junit.Assert.assertTrue;
import static org.junit.Before;
import static org.junit.Test;

/**
 * Comment test class.
 */
public class CommentTestClass {
    private User user;

    /**
     * Set up method.
     */
    @Before
    public void SetUp(){
        user = mock((User.class));
    }    
    /**
     * Get privilege test.
     */
    @Test
    public void PrivilegeTest(){
        User comment = new Approve(user);
        when(user.getPrivileges()).thenReturn("Any Name comment");
    }
}
