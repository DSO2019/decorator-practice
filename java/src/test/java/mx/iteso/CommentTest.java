package mx.iteso;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import mx.iteso.privileges.Comment;
import org.junit.Before;
import org.junit.Test;

/**
 * Class CommentTest.
 */
public class CommentTest {

    /**
     * User.
     */
    private User user;

    /**
     * Setup.
     */
    @Before
    public void setUp() {
        user = mock((User.class));
    }

    /**
     * Test Permission.
     */
    @Test
    public void testCommentPermission() {
        User comment = new Comment(user);
        when(user.commentPermission()).thenReturn(false);
        boolean commentEnabled = comment.commentPermission();
        assertTrue(commentEnabled);
    }

    /**
     * Test Description.
     */
    @Test
    public void testDescription() {
        User comment = new Comment(user);
        when(user.getDescription()).thenReturn("Current user");
        String description = comment.getDescription();
        assertEquals("Comment: Current user", description);
    }
}
