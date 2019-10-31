package mx.iteso;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by ElMaligno666 on October 2019.
 */
public class CommentTest {
    private User user;

    
    @Before
    public void setUp() {
        user = new FinalUser();
    }

    @Test
    public void testComment() {
        assertEquals(user.comment(), "No tengo privilegios para comentar");
        this.user = new Comment(this.user);
        assertEquals(user.comment(), "Puedo comentar");  
    }

}
