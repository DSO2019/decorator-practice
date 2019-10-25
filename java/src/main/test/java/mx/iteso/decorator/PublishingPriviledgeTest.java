package mx.iteso.decorator;

import mx.iteso.Priviledges.PublishingPriviledge;
import mx.iteso.User;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

public class PublishingPriviledgeTest {
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
    public void testPublish(){
        user = new PublishingPriviledge(user);
        String str = user.publisherPriviledgeUser();
        assertEquals("Ya puedes publicar" , str);
    }
}
