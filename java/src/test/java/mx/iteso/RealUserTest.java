package mx.iteso;

import static org.junit.Assert.assertFalse;
import org.junit.Test;

/** Real User Test Class. */
public class RealUserTest {

    @Test
    public void testPublishPermission() {
        User user = new RealUser();
        assertFalse(user.publishPermission());
    }

    @Test
    public void testDeletionPermission() {
        User user = new RealUser();
        assertFalse(user.deletionPermission());
    }

    @Test
    public void testApprovalPermission() {
        User user = new RealUser();
        assertFalse(user.approvalPermission());
    }

    @Test
    public void testCommentPermission() {
        User user = new RealUser();
        assertFalse(user.commentPermission());
    }
}
