package mx.iteso;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

public class AdminPermissionTest {

    private User user;

    @Before
    public void setUp(){
        user = mock((User.class));
    }

    @Test
    public void testApprovalPermission(){
        User admin = new BaseUser();
        admin = new AdminPermissions(admin);
        when(user.canApprove()).thenReturn(false);
        when(user.canComment()).thenReturn(false);
        when(user.canDelete()).thenReturn(false);
        when(user.canPublish()).thenReturn(false);
        boolean approve = admin.canApprove();
        boolean comment = admin.canComment();
        boolean delete = admin.canDelete();
        boolean publish = admin.canPublish();
        assertTrue(approve);
        assertTrue(comment);
        assertTrue(delete);
        assertTrue(publish);
    }

    @Test
    public void testDescription(){
        User admin = new BaseUser();
        admin = new AdminPermissions(admin);
        when(user.getDescription()).thenReturn("User");
        String desc = admin.getDescription();
        assertEquals("Admin User", desc);
    }
}