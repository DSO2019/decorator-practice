package mx.iteso.decorator;

import mx.iteso.Priviledges.CommentingPriviledge;
import mx.iteso.User;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

public class CommentingPriviledgeTest {
    /**
     * Creamos usuario para trabajar.
     */
    private User user;

    /**
     * Mock  de la clase usuario.
     */
    @Before
    public void setUp(){
        user = mock(User.class);
    }

    /**
     * Probamos nadamas approving.
     */
    @Test
    public void testCommenting(){
        user = new CommentingPriviledge(user);
        String str = user.commentingPriviledgeUser();
        assertEquals("Ya puedes comentar" , str);
    }
}
