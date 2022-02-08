import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {

    Engine engine;

    @Before
    public void before(){
        engine = new Engine("Petrol");
    }

    @Test
    public void hasFuelType(){
        assertEquals("Petrol", engine.getFuelType());
    }
}
