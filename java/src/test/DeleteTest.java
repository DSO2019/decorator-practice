package mx.iteso;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.Assert.Equals;
import static org.junit.Assert.assertTrue;
import static org.junit.Before;
import static org.junit.Test;

/**
 * Delete test class.
 */
public class DeleteTestClass {
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
        User delete = new Approve(user);
        when(user.getPrivileges()).thenReturn("Any Name delete");
    }
}
