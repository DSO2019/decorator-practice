package mx.iteso.decorator;

import mx.iteso.Priviledges.ApprovingPriviledge;
import mx.iteso.User;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ApprovingPriviledgeTest {
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
    public void testApproving(){
        user = new ApprovingPriviledge(user);
        String str = user.approvingPriviledgeUser();
        assertEquals("Ya tienes privilegio de aprobar" , str);
    }
}
