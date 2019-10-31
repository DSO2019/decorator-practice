package mx.iteso;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.junit.Before;
import org.junit.Test;


/**
 * test class for comment permission.
 */
public class TestComment {
    /**
     * creating user for testing.
     */
    private User user;

    /**
     * setting mocked object up.
     */
    @Before
    public void setUp() {
        user = mock((User.class));
    }

    /**
     * Can comment test.
     */
    @Test
    public void testCanComment() {
        User commenter = new Comment(user);
        when(user.canComment()).thenReturn(false);
        boolean canComment = commenter.canComment();
        assertTrue(canComment);
    }

    /**
     * Testing actual user description.
     */
    @Test
    public void testDescription() {
        User commenter = new Comment(user);
        when(user.getDescription()).thenReturn("Usuario con privilegio: ");
        String descripcion = publisher.getDescription();
        assertEquals("Usuario con privilegio: ", descripcion);
    }

}
