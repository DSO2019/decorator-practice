package mx.iteso.test;

import mx.iteso.User;
import mx.iteso.privileges.Comment;
import org.junit.Before;
import org.junit.Test;
/**
 * test class for commnets permission.
 */
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Test class for coments.
 */
public class TestComment {
    /**
     * User to test class.
     */
    private User user;
    /**
     * Nuevo usuario para agregar permisos.
     */
    @Before
    public void setUp() {
        user = mock((User.class));
    }
    /**
     * Test comnetar.
     */
    @Test
    public void testCanComment() {
        User commenter = new Comment(user);
        when(user.canComment()).thenReturn(false);
        boolean canComment = commenter.canComment();
        assertTrue(canComment);
    }
    /**
     * Descripcion comentar.
     */
    @Test
    public void testDescription() {
        User commenter = new Comment(user);
        when(user.getDescription()).thenReturn("User with privileges: ");
        String desc = commenter.getDescription();
        assertEquals("User with privileges: permiso de comentar", desc);
    }
}
