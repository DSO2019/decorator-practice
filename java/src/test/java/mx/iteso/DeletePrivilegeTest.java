package mx.iteso;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
import org.mockito.Mockito.*;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.eq;

public class DeletePrivilegeTest{
    DeletePrivilege priv;
    User mockedUser;

    @Before
    public void setUp(){
        mockedUser = mock(User.class);
        priv = new DeletePrivilege(mockedUser);
    }

    @Test
    public void test_getPrivilege(){
        when(mockedUser.getUsername()).thenReturn("usuario");
        assertEquals("usuario puede borrar",priv.getPrivilege());
    }

    @Test
    public void test_publish(){
        when(mockedUser.publish()).thenReturn(false);
        assertEquals(false,priv.publish());
    }

    @Test
    public void test_delete(){
        assertEquals(true,priv.delete());
    }

    @Test
    public void test_approve(){
        when(mockedUser.aprove()).thenReturn(false);
        assertEquals(false,priv.aprove());
    }

    @Test
    public void test_comment(){
        when(mockedUser.comment()).thenReturn(false);
        assertEquals(false,priv.comment());
    }
}