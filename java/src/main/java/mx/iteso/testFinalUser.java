package mx.iteso;

/**
 * imports
 */
import static org.junit.Assert.assertFalse;
import org.junit.Test;

/**
 * Clase para test del usuario final.
 */
public class TestFinalUser {
    /**
     * setting up User.
     */
    @Test
    public void testCanApprove() {
        User user = new FinalUser();
        assertFalse(user.canApprove());
    }

    /**
     * testing comment permission.
     */
    @Test
    public void testCanComment() {
        User user = new FinalUser();
        assertFalse(user.canComment());
    }

    /**
     * testing delete permission.
     */
    @Test
    public void testCanDelete() {
        User user = new FinalUser();
        assertFalse(user.canDelete());
    }

    /**
     * testing publish permission.
     */
    @Test
    public void testCanPublish() {
        User user = new FinalUser();
        assertFalse(user.canPublish());
    }
}
