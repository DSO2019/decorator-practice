package mx.iteso;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
import org.mockito.Mockito.*;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.eq;

public class AprovePrivilegeTest{
    AprovePrivilege priv;
    User mockedUser;

    @Before
    public void setUp(){
        mockedUser = mock(User.class);
        priv = new AprovePrivilege(mockedUser);
    }

    @Test
    public void test_getPrivilege(){
        when(mockedUser.getUsername()).thenReturn("usuario");
        assertEquals("usuario puede aprobar",priv.getPrivilege());
    }

    @Test
    public void test_publish(){
        when(mockedUser.publish()).thenReturn(false);
        assertEquals(false,priv.publish());
    }

    @Test
    public void test_delete(){
        when(mockedUser.delete()).thenReturn(false);
        assertEquals(false,priv.delete());
    }

    @Test
    public void test_approve(){
        assertEquals(true,priv.aprove());
    }

    @Test
    public void test_comment(){
        when(mockedUser.comment()).thenReturn(false);
        assertEquals(false,priv.comment());
    }
}