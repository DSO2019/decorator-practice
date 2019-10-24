import mx.iteso.User;
import mx.iteso.UsuarioBase;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UsuarioBaseTest {
    private User user;
    @Before
    public void setUp(){
        user = new UsuarioBase();
    }

    @Test
    public void permisosBase() {
        assertEquals(false,user.publish());
        assertEquals(false,user.comment());
        assertEquals(false,user.approve());
        assertEquals(false,user.delete());
    }
}
