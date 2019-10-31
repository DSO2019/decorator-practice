package mx.iteso.privileges;

import mx.iteso.Privilege;
import mx.iteso.User;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class DeleteTest {
    private User user;

    @Before
    public void setUp() {
        user = new FinalUser();
    }

    @Test
    public void testDelete() {
        assertEquals(user.delete(), "No privileges to delete";
        this.user = new Delete(this.user);
        assertEquals(user.delete(), "Can delete");
    }
}
