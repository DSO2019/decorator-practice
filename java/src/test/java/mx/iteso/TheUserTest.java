package mx.iteso;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

/**
 * Class TheUserTest.
 */
public class TheUserTest {

    /**
     * Publish Permission Test.
     */
    @Test
    public void testPublishPermission() {
        User user = new TheUser();
        assertFalse(user.publishPermission());
    }

    /**
     * Delete PermissionTest.
     */
    @Test
    public void testDeletePermission() {
        User user = new TheUser();
        assertFalse(user.deletePermission());
    }

    /**
     * Approve Permission Test
     */
    @Test
    public void testApprovePermission() {
        User user = new TheUser();
        assertFalse(user.approvePermission());
    }

    @Test
    public void testCommentPermission() {
        User user = new TheUser();
        assertFalse(user.commentPermission());
    }
}
