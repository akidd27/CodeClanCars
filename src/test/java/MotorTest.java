import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MotorTest {

    Motor motor;

    @Before
    public void before(){
        motor = new Motor(90);
    }

    @Test
    public void hasPower(){
        assertEquals(90, motor.getPower());
    }
}
