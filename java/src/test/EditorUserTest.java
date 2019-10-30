package mx.iteso;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.Assert.Equals;
import static org.junit.Assert.assertTrue;
import static org.junit.Before;
import static org.junit.Test;

/**
 * Editor user test class.
 */
public class EditorUserTest {
    private User user;

    /**
     * Set up method.
     */
    @Before
    public void SetUp(){
        user = mock((EditorUser.class));
    }    
    /**
     * Get name test.
     */
    @Test
    public void NameTest(){
        when(user.getName()).thenReturn("Editor");
    }
}
