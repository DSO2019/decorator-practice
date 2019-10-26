package mx.iteso;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

public class EditorPermissionTest {

    private User user;

    @Before
    public void setUp(){
        user = mock((User.class));
    }

    @Test
    public void testApprovalPermission(){
        User editor = new BaseUser();
        editor = new EditorPermissions(editor);
        when(user.canApprove()).thenReturn(false);
        when(user.canComment()).thenReturn(false);
        when(user.canDelete()).thenReturn(false);
        when(user.canPublish()).thenReturn(false);
        boolean approve = editor.canApprove();
        boolean comment = editor.canComment();
        boolean delete = editor.canDelete();
        boolean publish = editor.canPublish();
        assertTrue(approve);
        assertTrue(comment);
        assertTrue(!delete);
        assertTrue(publish);
    }

    @Test
    public void testDescription(){
        User editor = new BaseUser();
        editor = new EditorPermissions(editor);
        when(user.getDescription()).thenReturn("User");
        String desc = editor.getDescription();
        assertEquals("Editor User", desc);
    }
}