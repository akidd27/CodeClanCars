import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BodyTest {

    Body body;

    @Before
    public void before(){
        body = new Body("Pink");
    }

    @Test
    public void hasColour(){
        assertEquals("Pink", body.getColour());
    }
}
