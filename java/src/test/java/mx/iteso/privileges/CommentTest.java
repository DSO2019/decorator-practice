import mx.iteso.User;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CommentTest {
    private User user;

    @Before
    public void setUp() {
        user = new FinalUser();
    }

    @Test
    public void testComment() {
        assertEquals(user.comment(), "No privileges to comment");
        this.user = new Comment(this.user);
        assertEquals(user.comment(), "Can comment");

}
