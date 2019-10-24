package mx.iteso.complements;

import mx.iteso.User;
import mx.iteso.UsuarioBase;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

public class PublisherTest {
    private User user;
    @Before
    public void setUp(){
        user = mock((UsuarioBase.class));
    }

    @Test
    public void publish() {
        User publisher = new Publisher(user);
        assertEquals(true,publisher.publish());
    }

    @Test
    public void comment() {
        User publisher = new Publisher(user);
        assertEquals(false,publisher.comment());
    }

    @Test
    public void approve() {
        User publisher = new Publisher(user);
        assertEquals(false,publisher.approve());
    }

    @Test
    public void delete() {
        User publisher = new Publisher(user);
        assertEquals(false,publisher.delete());
    }
}
