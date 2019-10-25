package mx.iteso.decorator;

import mx.iteso.Priviledges.DeletingPriviledge;
import mx.iteso.User;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

public class DeletingPriviledgeTest {
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
    public void testDelete(){
        user = new DeletingPriviledge(user);
        String str = user.deletingPriviledgeUser();
        assertEquals("Ya puedes eliminar" , str);
    }
}
