package mx.iteso;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by ElMaligno666 on October 2019.
 */
public class ApproveTest {
    private User user;

    
    @Before
    public void setUp() {
        user = new FinalUser();
    }

    @Test
    public void testApprove() {
        assertEquals(user.approve(), "No tengo privilegios para aprobar");
        this.user = new Approve(this.user);
        assertEquals(user.approve(), "Puedo aprobar");  
    }

}
