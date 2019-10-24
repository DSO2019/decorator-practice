package mx.iteso.complements;

import mx.iteso.User;
import mx.iteso.UsuarioBase;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

public class EditorTest {
    private User user;
    @Before
    public void setUp(){
        user = mock((UsuarioBase.class));
    }

    @Test
    public void publish() {
        User editor = new Editor(user);
        assertEquals(false,editor.publish());
    }

    @Test
    public void comment() {
        User editor = new Editor(user);
        assertEquals(true,editor.comment());
    }

    @Test
    public void approve() {
        User editor = new Editor(user);
        assertEquals(false,editor.approve());
    }

    @Test
    public void delete() {
        User editor = new Editor(user);
        assertEquals(false,editor.delete());
    }
}
