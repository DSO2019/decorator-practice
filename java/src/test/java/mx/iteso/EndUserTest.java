package mx.iteso;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
import org.mockito.Mockito.*;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.eq;

public class EndUserTest {
    EndUser user;

    @Before
    public void setUp(){
        user = new EndUser("usuario");
    }

    @Test
    public void test_getUsername(){
        assertEquals("usuario",user.getUsername());
    }

    @Test
    public void test_publish(){
        assertEquals(false,user.publish());
    }

    @Test
    public void test_delete(){
        assertEquals(false,user.delete());
    }

    @Test
    public void test_approve(){
        assertEquals(false,user.aprove());
    }

    @Test
    public void test_comment(){
        assertEquals(false,user.comment());
    }
}