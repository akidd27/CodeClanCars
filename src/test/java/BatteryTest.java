import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BatteryTest {

    Battery battery;

    @Before
    public void before(){
        battery = new Battery(120);
    }

    @Test
    public void hasCapacity(){
        assertEquals(120, battery.getCapacity());
    }
}
