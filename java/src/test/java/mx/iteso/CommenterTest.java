package mx.iteso;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

/** Commenter Test Class. */
public class CommenterTest {
    /** User to be mocked. */
    private User user;
    
    /** Setup mehtod. */
    @Before
    public void setUp(){
        user = mock((User.class));
    }

    /** Method that proves the comment permission. */
    @Test
    public void testCommentPermission(){
        User commenter = new Commenter(user);
        when(user.commentPermission()).thenReturn(false);
        boolean commentEnabled = commenter.commentPermission();
        assertTrue(commentEnabled);
    }
    
    /** Method that tests the description on comment test. */
    @Test
    public void testDescription(){
        User commenter = new Commenter(user);
        when(user.getDescription()).thenReturn("Current user");
        String desc = commenter.getDescription();
        assertEquals("Commenter: Current user", desc);
    }
}
