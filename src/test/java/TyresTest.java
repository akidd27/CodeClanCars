import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TyresTest {

    Tyres tyres;

    @Before
    public void before(){
        tyres = new Tyres(18);
    }

    @Test
    public void hasSize(){
        assertEquals(18, tyres.getSize());
    }
}
