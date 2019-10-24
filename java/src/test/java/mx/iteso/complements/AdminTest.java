package mx.iteso.complements;

import mx.iteso.User;
import mx.iteso.UsuarioBase;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AdminTest {
    private User user;
    @Before
    public void setUp(){
        user = mock((UsuarioBase.class));
    }

    @Test
    public void publish() {
        User admin = new Admin(user);
        assertEquals(false,admin.publish());
    }

    @Test
    public void comment() {
        User admin = new Admin(user);
        assertEquals(false,admin.comment());
    }

    @Test
    public void approve() {
        User admin = new Admin(user);
        assertEquals(true,admin.approve());
    }

    @Test
    public void delete() {
        User admin = new Admin(user);
        assertEquals(true,admin.delete());
    }
}
